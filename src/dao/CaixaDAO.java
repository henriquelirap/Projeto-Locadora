package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jdbc.Conexao;
import model.Caixa;
import static vision.CaixaDia.dataCaixaFunc;
import static vision.Login.cliente_id_logado;
import static vision.Login.locacao_id_caixa;
import static vision.Login.nome_logado;
import static vision.Login.total;
import static vision.MovimentacoesCaixa.dataMov;
import static vision.Pagamento.formaPagamento;

public class CaixaDAO {

    //Método para inserir nova movimentação no caixa;
    public static void inserirMov(Caixa caixa) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "INSERT INTO CAIXA(DATA, LOCACAO_ID, CLIENTE_ID, NOME_CLIENTE, " + formaPagamento + ")" + "value(?, ?, ?, ?, ?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, caixa.getData());
        ps.setInt(2, locacao_id_caixa);
        ps.setInt(3, cliente_id_logado);
        ps.setString(4, nome_logado);
        ps.setDouble(5, total);
        ps.execute();
        ps.close();
        conexao.close();
    }

    //Método para mostrar transações do caixa por data para funcionario;
    public static Caixa todasMovCaixaFunc() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT SUM(DINHEIRO) as TOT_DINHEIRO, SUM(CARTAO) as TOT_CARTAO FROM CAIXA WHERE DATA = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, dataCaixaFunc);
        ResultSet rs = ps.executeQuery();
        Caixa caixaFunc = null;

        while (rs.next()) {
            caixaFunc = new Caixa(rs.getDouble("tot_dinheiro"), rs.getDouble("tot_cartao"));
        }

        rs.close();
        ps.close();
        conexao.close();
        return caixaFunc;
    }

    //Método para mostrar transações do caixa por data para admin;
    public static Caixa todasMovCaixaAdm() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT SUM(DINHEIRO) as TOT_DINHEIRO, SUM(CARTAO) as TOT_CARTAO FROM CAIXA WHERE DATA = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, dataMov);
        ResultSet rs = ps.executeQuery();
        Caixa caixaFunc = null;

        while (rs.next()) {
            caixaFunc = new Caixa(rs.getDouble("tot_dinheiro"), rs.getDouble("tot_cartao"));
        }

        rs.close();
        ps.close();
        conexao.close();
        return caixaFunc;
    }
}
