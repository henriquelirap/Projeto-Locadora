package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jdbc.Conexao;
import model.Email;
import static vision.EsqueciSenha.emailEsq;
import static vision.EsqueciSenha.novaSenha;
import static vision.EsqueciSenha.usuarioEsq;

public class EmailDAO {

    //Método para verificar se usuário e email inseridos na recuperação de senha são válidos;
    public static Email verificarEmail() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM CLIENTE WHERE USUARIO = ? AND EMAIL = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, usuarioEsq);
        ps.setString(2, emailEsq);
        ResultSet rs = ps.executeQuery();
        Email email = null;

        while (rs.next()) {
            email = new Email(rs.getString("usuario"), rs.getString("email"), rs.getString("senha"));
        }

        return email;
    }

    //Método para trocar senha na tela de "Esqueci a senha";
    public static void trocaSenha() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "UPDATE CLIENTE SET SENHA = ? WHERE USUARIO = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, novaSenha);
        ps.setString(2, usuarioEsq);
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
}
