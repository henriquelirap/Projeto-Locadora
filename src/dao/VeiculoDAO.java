package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import jdbc.Conexao;
import model.Veiculo;
import static vision.Login.nome_logado;
import static vision.Login.veiculo_id_locado;
import static vision.Login.veiculoidSelecionado;

public class VeiculoDAO {

    //Método para cadastrar veículo novo no sistema;
    public static void cadastrarVeiculo(Veiculo veiculo) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "INSERT INTO VEICULOS SET NOME = ?, MODELO = ?, ANO = ?, MARCA = ?, VALOR_DIARIA = ?, STATUS = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, veiculo.getNome());
        ps.setString(2, veiculo.getModelo());
        ps.setString(3, veiculo.getAno());
        ps.setString(4, veiculo.getMarca());
        ps.setDouble(5, veiculo.getValor_diaria());
        ps.setString(6, veiculo.getStatus());
        ps.execute();
        ps.close();
        conexao.close();
    }

    //Método para listar todos os veículos cadastrados;
    public static ArrayList<Veiculo> listarTodosVeiculos() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM VEICULOS ORDER BY NOME ASC";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Veiculo> todosVeiculos = new ArrayList<Veiculo>();
        Veiculo veiculo = null;

        while (rs.next()) {
            veiculo = new Veiculo(rs.getInt("veiculo_id"), rs.getString("nome"), rs.getString("modelo"), rs.getString("ano"), rs.getString("marca"), rs.getDouble("valor_diaria"), rs.getString("status"), rs.getString("cliente_em_posse"));
            todosVeiculos.add(veiculo);
        }

        rs.close();;
        ps.close();
        conexao.close();
        return todosVeiculos;
    }

    //Métódo para listar veículos disponíveis;
    public static ArrayList<Veiculo> listarVeiculosDisponiveis() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM VEICULOS WHERE STATUS = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "Disponível");
        ResultSet rs = ps.executeQuery();
        ArrayList<Veiculo> todosVeiculos = new ArrayList<Veiculo>();
        Veiculo veiculo = null;

        while (rs.next()) {
            veiculo = new Veiculo(rs.getInt("veiculo_id"), rs.getString("nome"), rs.getString("modelo"), rs.getString("ano"), rs.getString("marca"), rs.getDouble("valor_diaria"), rs.getString("status"), rs.getString("cliente_em_posse"));
            todosVeiculos.add(veiculo);
        }

        rs.close();;
        ps.close();
        conexao.close();
        return todosVeiculos;
    }

    //Método para listar veículos não-disponíveis;
    public static ArrayList<Veiculo> listarVeiculosNaoDisponiveis() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM VEICULOS WHERE STATUS = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "Não-Disponível");
        ResultSet rs = ps.executeQuery();
        ArrayList<Veiculo> todosVeiculos = new ArrayList<Veiculo>();
        Veiculo veiculo = null;

        while (rs.next()) {
            veiculo = new Veiculo(rs.getInt("veiculo_id"), rs.getString("nome"), rs.getString("modelo"), rs.getString("ano"), rs.getString("marca"), rs.getDouble("valor_diaria"), rs.getString("status"), rs.getString("cliente_em_posse"));
            todosVeiculos.add(veiculo);
        }

        rs.close();;
        ps.close();
        conexao.close();
        return todosVeiculos;
    }

    //Método para remover veículos da tabela;
    public static void removerVeiculos() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "DELETE FROM VEICULOS WHERE VEICULO_ID = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, veiculoidSelecionado);
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }

    //Método para atualizar status de veículo;
    public static void atualizarStatusNaoDisp() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "UPDATE VEICULOS SET STATUS = ?, CLIENTE_EM_POSSE = ?" + "WHERE VEICULO_ID = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "Não-Disponível");
        ps.setString(2, nome_logado);
        ps.setInt(3, veiculo_id_locado);
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }

    //Método para atualizar status de veículo;
    public static void atualizarStatusDisp() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "UPDATE VEICULOS SET STATUS = ?, CLIENTE_EM_POSSE = ?" + "WHERE VEICULO_ID = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "Disponível");
        ps.setString(2, "");
        ps.setInt(3, veiculo_id_locado);
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
}
