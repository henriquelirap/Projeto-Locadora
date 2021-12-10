package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import jdbc.Conexao;
import model.Locacao;
import static vision.Login.cliente_id_logado;
import static vision.Login.locacao_id;
import static vision.Login.total;
import static vision.MinhasLocacoesCliente.dataHoje;
import static vision.MovimentacoesCaixa.dataMov;
import static vision.Pagamento.formaPagamento;

public class LocacaoDAO {

    //Método para inserir nova locação no banco;
    public static void novaLocacaoDAO(Locacao novaLocacao) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "INSERT INTO LOCACAO(CLIENTE_ID, NOME_CLIENTE, USUARIO, VEICULO_ID, NOME_VEICULO, VALOR_DIARIA, DATA_LOCACAO, DATA_DEVOLUCAO, VALOR_TOTAL, STATUS)value(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, novaLocacao.getCliente_id());
        ps.setString(2, novaLocacao.getNome_cliente());
        ps.setString(3, novaLocacao.getUsuario());
        ps.setInt(4, novaLocacao.getVeiculo_id());
        ps.setString(5, novaLocacao.getNome_veiculo());
        ps.setDouble(6, novaLocacao.getValor_diaria());
        ps.setString(7, novaLocacao.getData_locacao());
        ps.setString(8, novaLocacao.getData_devolucao());
        ps.setDouble(9, novaLocacao.getValor_total());
        ps.setString(10, novaLocacao.getStatus());
        ps.execute();
        ps.close();
        conexao.close();
    }

    //Método para mostrar todas as locações do usuário na tabela "Minhas Locações";
    public static ArrayList<Locacao> locacoesCliente() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM LOCACAO WHERE CLIENTE_ID = ? ORDER BY LOCACAO_ID ASC";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, cliente_id_logado);
        ResultSet rs = ps.executeQuery();
        ArrayList<Locacao> todasLocacoes = new ArrayList<Locacao>();
        Locacao locacao = null;

        while (rs.next()) {
            locacao = new Locacao(rs.getInt("locacao_id"), rs.getInt("cliente_id"), rs.getString("nome_cliente"), rs.getString("usuario"), rs.getInt("veiculo_id"), rs.getString("nome_veiculo"), rs.getDouble("valor_diaria"), rs.getString("data_locacao"), rs.getString("data_devolucao"), rs.getDouble("valor_total"), rs.getString("pagamento"), rs.getString("status"));
            todasLocacoes.add(locacao);
        }

        rs.close();
        ps.close();
        conexao.close();
        return todasLocacoes;
    }

    //Método para atualizar valor de locação do cliente, caso devolva em data diferente;
    public static void atualizarValorTotal() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "UPDATE LOCACAO SET VALOR_TOTAL = ?, STATUS = ?, DATA_DEVOLUCAO = ?" + "WHERE LOCACAO_ID = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setDouble(1, total);
        ps.setString(2, "Finalizado");
        ps.setString(3, dataHoje);
        ps.setInt(4, locacao_id);
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }

    //Método para listar todas as locações em relatorio de caixa por data;
    public static ArrayList<Locacao> todasLocacoesData() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM LOCACAO WHERE DATA_DEVOLUCAO = ? ORDER BY NOME_CLIENTE ASC";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, dataMov);
        ResultSet rs = ps.executeQuery();
        ArrayList<Locacao> todasLocacoes = new ArrayList<Locacao>();
        Locacao locacao = null;

        while (rs.next()) {
            locacao = new Locacao(rs.getInt("locacao_id"), rs.getInt("cliente_id"), rs.getString("nome_cliente"), rs.getString("usuario"), rs.getInt("veiculo_id"), rs.getString("nome_veiculo"), rs.getDouble("valor_diaria"), rs.getString("data_locacao"), rs.getString("data_devolucao"), rs.getDouble("valor_total"), rs.getString("pagamento"), rs.getString("status"));
            todasLocacoes.add(locacao);
        }

        rs.close();
        ps.close();
        conexao.close();
        return todasLocacoes;
    }

    //Método para listar todas as locações abertas em relatorio de caixa por data;
    public static ArrayList<Locacao> todasLocacoesAbertasData() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM LOCACAO WHERE STATUS = ? AND DATA_DEVOLUCAO = ? ORDER BY NOME_CLIENTE ASC";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "Aberto");
        ps.setString(2, dataMov);
        ResultSet rs = ps.executeQuery();
        ArrayList<Locacao> todasLocacoes = new ArrayList<Locacao>();
        Locacao locacao = null;

        while (rs.next()) {
            locacao = new Locacao(rs.getInt("locacao_id"), rs.getInt("cliente_id"), rs.getString("nome_cliente"), rs.getString("usuario"), rs.getInt("veiculo_id"), rs.getString("nome_veiculo"), rs.getDouble("valor_diaria"), rs.getString("data_locacao"), rs.getString("data_devolucao"), rs.getDouble("valor_total"), rs.getString("pagamento"), rs.getString("status"));
            todasLocacoes.add(locacao);
        }

        rs.close();
        ps.close();
        conexao.close();
        return todasLocacoes;
    }

    //Método para listar todas as locações finalizadas em relatorio de caixa por data;
    public static ArrayList<Locacao> todasLocacoesFinalizadasData() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM LOCACAO WHERE STATUS = ? AND DATA_DEVOLUCAO = ? ORDER BY NOME_CLIENTE ASC";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "Finalizado");
        ps.setString(2, dataMov);
        ResultSet rs = ps.executeQuery();
        ArrayList<Locacao> todasLocacoes = new ArrayList<Locacao>();
        Locacao locacao = null;

        while (rs.next()) {
            locacao = new Locacao(rs.getInt("locacao_id"), rs.getInt("cliente_id"), rs.getString("nome_cliente"), rs.getString("usuario"), rs.getInt("veiculo_id"), rs.getString("nome_veiculo"), rs.getDouble("valor_diaria"), rs.getString("data_locacao"), rs.getString("data_devolucao"), rs.getDouble("valor_total"), rs.getString("pagamento"), rs.getString("status"));
            todasLocacoes.add(locacao);
        }

        rs.close();
        ps.close();
        conexao.close();
        return todasLocacoes;
    }

    //Método para listar todas as locações em relatorio de caixa;
    public static ArrayList<Locacao> todasLocacoes() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM LOCACAO ORDER BY NOME_CLIENTE ASC";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Locacao> todasLocacoes = new ArrayList<Locacao>();
        Locacao locacao = null;

        while (rs.next()) {
            locacao = new Locacao(rs.getInt("locacao_id"), rs.getInt("cliente_id"), rs.getString("nome_cliente"), rs.getString("usuario"), rs.getInt("veiculo_id"), rs.getString("nome_veiculo"), rs.getDouble("valor_diaria"), rs.getString("data_locacao"), rs.getString("data_devolucao"), rs.getDouble("valor_total"), rs.getString("pagamento"), rs.getString("status"));
            todasLocacoes.add(locacao);
        }

        rs.close();
        ps.close();
        conexao.close();
        return todasLocacoes;
    }

    //Método para listar todas as locações abertas em relatorio de caixa;
    public static ArrayList<Locacao> todasLocacoesAbertas() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM LOCACAO WHERE STATUS = ? ORDER BY NOME_CLIENTE ASC";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "Aberto");
        ResultSet rs = ps.executeQuery();
        ArrayList<Locacao> todasLocacoes = new ArrayList<Locacao>();
        Locacao locacao = null;

        while (rs.next()) {
            locacao = new Locacao(rs.getInt("locacao_id"), rs.getInt("cliente_id"), rs.getString("nome_cliente"), rs.getString("usuario"), rs.getInt("veiculo_id"), rs.getString("nome_veiculo"), rs.getDouble("valor_diaria"), rs.getString("data_locacao"), rs.getString("data_devolucao"), rs.getDouble("valor_total"), rs.getString("pagamento"), rs.getString("status"));
            todasLocacoes.add(locacao);
        }

        rs.close();
        ps.close();
        conexao.close();
        return todasLocacoes;
    }

    //Método para listar todas as locações finalizadas em relatorio de caixa;
    public static ArrayList<Locacao> todasLocacoesFinalizadas() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM LOCACAO WHERE STATUS = ? ORDER BY NOME_CLIENTE ASC";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "Finalizado");
        ResultSet rs = ps.executeQuery();
        ArrayList<Locacao> todasLocacoes = new ArrayList<Locacao>();
        Locacao locacao = null;

        while (rs.next()) {
            locacao = new Locacao(rs.getInt("locacao_id"), rs.getInt("cliente_id"), rs.getString("nome_cliente"), rs.getString("usuario"), rs.getInt("veiculo_id"), rs.getString("nome_veiculo"), rs.getDouble("valor_diaria"), rs.getString("data_locacao"), rs.getString("data_devolucao"), rs.getDouble("valor_total"), rs.getString("pagamento"), rs.getString("status"));
            todasLocacoes.add(locacao);
        }

        rs.close();
        ps.close();
        conexao.close();
        return todasLocacoes;
    }

    //Método para inserir forma de pagamento na locação;
    public static void Pagamento() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "UPDATE LOCACAO SET PAGAMENTO = ?" + "WHERE LOCACAO_ID = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, formaPagamento);
        ps.setInt(2, locacao_id);
        ps.execute();
        ps.close();
        conexao.close();
    }

    //Método para remover locacções em aberto;
    public static void removeLoc(int locacaoId) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "DELETE FROM LOCACAO WHERE LOCACAO_ID = ? AND STATUS = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, locacaoId);
        ps.setString(2, "Aberto");
        ps.execute();
        ps.close();
    }
}
