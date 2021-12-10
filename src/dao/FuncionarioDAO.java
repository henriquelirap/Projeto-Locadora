package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import jdbc.Conexao;
import model.Funcionario;
import static vision.Login.funcionarioidSelecionado;
import static vision.Login.nivelAcessado;
import static vision.Login.nomeBuscado;
import static vision.Login.usuarioLogado;

public class FuncionarioDAO {

    //Método para logar com usuário de funcionário;
    public static Funcionario loginFunc(String usuario, String senha) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM FUNCIONARIO WHERE USUARIO = ? AND SENHA = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, usuario);
        ps.setString(2, senha);
        ResultSet rs = ps.executeQuery();
        Funcionario funcionario = null;

        while (rs.next()) {
            funcionario = new Funcionario(0, null, null, null);
            funcionario.setFuncionario_id(rs.getInt("funcionario_id"));
            funcionario.setNome(rs.getString("nome"));
            funcionario.setUsuario(rs.getString("usuario"));
            funcionario.setNivel(rs.getString("nivel"));
            usuarioLogado = rs.getString("usuario");
            nivelAcessado = rs.getString("nivel");
        }

        rs.close();
        ps.close();
        conexao.close();
        return funcionario;
    }

    //Método para cadastrar funcionários;
    public static void cadastrarFuncionario(Funcionario funcionario) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "INSERT INTO FUNCIONARIO(NOME, TELEFONE, CPF, USUARIO, SENHA, EMAIL, NIVEL)value(?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, funcionario.getNome());
        ps.setString(2, funcionario.getTelefone());
        ps.setString(3, funcionario.getCpf());
        ps.setString(4, funcionario.getUsuario());
        ps.setString(5, funcionario.getSenha());
        ps.setString(6, funcionario.getEmail());
        ps.setString(7, funcionario.getNivel());
        ps.execute();
        ps.close();
        conexao.close();
    }

    //Método para o próprio funcionário visualizar seus dados através do botão "Meus Dados";
    public static Funcionario meusDadosFuncionario() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM FUNCIONARIO WHERE USUARIO = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, usuarioLogado);
        ResultSet rs = ps.executeQuery();
        Funcionario funcionario = null;

        if (rs.next()) {
            funcionario = new Funcionario(rs.getString("nome"), rs.getString("telefone"), rs.getString("cpf"), rs.getString("usuario"), rs.getString("email"));
        }

        ps.execute();
        ps.close();
        conexao.close();
        return funcionario;
    }

    //Método para o próprio funcionario editar seus dados através do botão "Meus Dados";
    public static void atualizarMeusDadosFuncionario(Funcionario funcionarioEditar) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "UPDATE FUNCIONARIO SET NOME = ?, TELEFONE = ?, EMAIL = ?" + "WHERE USUARIO = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, funcionarioEditar.getNome());
        ps.setString(2, funcionarioEditar.getTelefone());
        ps.setString(3, funcionarioEditar.getEmail());
        ps.setString(4, usuarioLogado);
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }

    //Método para visualizar todos os funcionários cadastrados na tabela;
    public static ArrayList<Funcionario> buscaTodosFuncionarios() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM FUNCIONARIO ORDER BY NOME ASC";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Funcionario> todosFuncionarios = new ArrayList<>();
        Funcionario funcionarios = null;

        while (rs.next()) {
            funcionarios = new Funcionario(rs.getInt("funcionario_id"), rs.getString("nome"), rs.getString("telefone"), rs.getString("cpf"), rs.getString("usuario"), rs.getString("email"), rs.getString("nivel"));
            todosFuncionarios.add(funcionarios);
        }

        ps.execute();
        ps.close();
        conexao.close();
        return todosFuncionarios;
    }

    //Método para buscar funcionário por nome na tabela;
    public static ArrayList<Funcionario> buscaNomeFuncionarios() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM FUNCIONARIO WHERE NOME LIKE ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "%" + nomeBuscado + "%");
        ResultSet rs = ps.executeQuery();
        ArrayList<Funcionario> funcionariosBuscados = new ArrayList<Funcionario>();
        Funcionario funcionarios = null;

        while (rs.next()) {
            funcionarios = new Funcionario(rs.getInt("funcionario_id"), rs.getString("nome"), rs.getString("telefone"), rs.getString("cpf"), rs.getString("usuario"), rs.getString("email"), rs.getString("nivel"));
            funcionariosBuscados.add(funcionarios);
        }

        ps.execute();
        ps.close();
        conexao.close();
        return funcionariosBuscados;
    }

    //Método para remover funcionario selecionado em tabela;
    public static void removerFuncionario() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "DELETE FROM FUNCIONARIO WHERE FUNCIONARIO_ID = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, funcionarioidSelecionado);
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }

    //Método para atualizar cadastro de funcionários a partir da tabela de funcionarios;
    public static void atualizarFuncionarioTabela(Funcionario funcionarioEditar) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "UPDATE FUNCIONARIO SET NOME = ?, TELEFONE = ?, EMAIL = ?, NIVEL = ?" + "WHERE FUNCIONARIO_ID = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, funcionarioEditar.getNome());
        ps.setString(2, funcionarioEditar.getTelefone());
        ps.setString(3, funcionarioEditar.getEmail());
        ps.setString(4, funcionarioEditar.getNivel());
        ps.setInt(5, funcionarioidSelecionado);
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }

}
