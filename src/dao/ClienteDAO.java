package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.Conexao;
import model.Cliente;
import static vision.Login.clienteidSelecionado;
import static vision.Login.usuarioLogado;
import static vision.Login.nivelAcessado;
import static vision.Login.nomeBuscado;
import static vision.Login.cliente_id_logado;
import static vision.Login.nome_logado;

public class ClienteDAO {

    //Método para logar e armazenar nível do cliente;
    public static Cliente login(String usuario, String senha) throws SQLException {
        //Logando no sistema;
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM CLIENTE WHERE USUARIO = ? AND SENHA = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, usuario);
        ps.setString(2, senha);
        ResultSet rs = ps.executeQuery();
        Cliente cliente = null;

        while (rs.next()) {
            cliente = new Cliente(0, null, null, null);
            cliente.setCliente_id(rs.getInt("cliente_id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setUsuario(rs.getString("usuario"));
            cliente.setNivel(rs.getString("nivel"));
            cliente_id_logado = rs.getInt("cliente_id");
            nome_logado = rs.getString("nome");
            usuarioLogado = rs.getString("usuario");
            nivelAcessado = rs.getString("nivel");
        }

        rs.close();
        ps.close();
        conexao.close();

        return cliente;
    }

    //Método para novo cadastro de cliente;
    public static Cliente cadastroCliente(Cliente cliente) throws SQLException {
        //Cadastrando novo cliente na tela inicial;
        Connection conexao = new Conexao().getConexao();
        String sql = "INSERT INTO CLIENTE(NOME, TELEFONE, CPF, RG, RUA, NUMERO_RESIDENCIA, COMPLEMENTO, BAIRRO, CEP, CIDADE, ESTADO, USUARIO, SENHA, EMAIL, NIVEL)value(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getTelefone());
        ps.setString(3, cliente.getCpf());
        ps.setString(4, cliente.getRg());
        ps.setString(5, cliente.getRua());
        ps.setInt(6, cliente.getNumero_residencia());
        ps.setString(7, cliente.getComplemento());
        ps.setString(8, cliente.getBairro());
        ps.setString(9, cliente.getCep());
        ps.setString(10, cliente.getCidade());
        ps.setString(11, cliente.getEstado());
        ps.setString(12, cliente.getUsuario());
        ps.setString(13, cliente.getSenha());
        ps.setString(14, cliente.getEmail());
        ps.setString(15, cliente.getNivel());
        ps.execute();
        ps.close();
        conexao.close();
        return cliente;
    }

    //Método para visualizar dados do cliente na tela "Meus Dados";
    public static Cliente meusDadosCliente() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM CLIENTE WHERE USUARIO = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, usuarioLogado);
        ResultSet rs = ps.executeQuery();
        Cliente clienteEditar = null;

        if (rs.next()) {
            clienteEditar = new Cliente(rs.getString("nome"), rs.getString("telefone"), rs.getString("cpf"), rs.getString("rg"), rs.getString("rua"), rs.getInt("numero_residencia"), rs.getString("complemento"), rs.getString("bairro"), rs.getString("cep"), rs.getString("cidade"), rs.getString("estado"), rs.getString("usuario"), rs.getString("email"));
        }

        ps.execute();
        ps.close();
        conexao.close();
        return clienteEditar;
    }

    //Método para atualizar dados do cliente na tela "Meus Dados";
    public static Cliente atualizarMeusDadosCliente(Cliente clienteEditar) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "UPDATE CLIENTE SET NOME = ?, TELEFONE = ?, RG = ?, RUA = ?, NUMERO_RESIDENCIA = ?, COMPLEMENTO = ?, BAIRRO = ?, CEP = ?, CIDADE = ?, ESTADO = ?, EMAIL = ?" + "WHERE USUARIO = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, clienteEditar.getNome());
        ps.setString(2, clienteEditar.getTelefone());
        ps.setString(3, clienteEditar.getRg());
        ps.setString(4, clienteEditar.getRua());
        ps.setInt(5, clienteEditar.getNumero_residencia());
        ps.setString(6, clienteEditar.getComplemento());
        ps.setString(7, clienteEditar.getBairro());
        ps.setString(8, clienteEditar.getCep());
        ps.setString(9, clienteEditar.getCidade());
        ps.setString(10, clienteEditar.getEstado());
        ps.setString(11, clienteEditar.getEmail());
        ps.setString(12, usuarioLogado);
        ps.executeUpdate();
        ps.close();
        conexao.close();
        return clienteEditar;
    }

    //Método para buscar todos os clientes cadastrados;
    public static ArrayList<Cliente> buscaTodosClientes() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM CLIENTE ORDER BY NOME ASC";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Cliente> todosClientes = new ArrayList<>();
        Cliente clientes = null;

        while (rs.next()) {
            clientes = new Cliente(rs.getInt("cliente_id"), rs.getString("nome"), rs.getString("telefone"), rs.getString("cpf"), rs.getString("rg"), rs.getString("rua"), rs.getInt("numero_residencia"), rs.getString("complemento"), rs.getString("bairro"), rs.getString("cep"), rs.getString("cidade"), rs.getString("estado"), rs.getString("usuario"), rs.getString("email"), rs.getString("nivel"));
            todosClientes.add(clientes);
        }

        ps.execute();
        ps.close();
        conexao.close();
        return todosClientes;
    }

    //Método para buscar cliente pelo nome na tabela;
    public static ArrayList<Cliente> buscaNomeClientes() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "SELECT * FROM CLIENTE WHERE NOME LIKE ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, "%" + nomeBuscado + "%");
        ResultSet rs = ps.executeQuery();
        ArrayList<Cliente> clientesBuscados = new ArrayList<>();
        Cliente clientes = null;

        while (rs.next()) {
            clientes = new Cliente(rs.getInt("cliente_id"), rs.getString("nome"), rs.getString("telefone"), rs.getString("cpf"), rs.getString("rg"), rs.getString("rua"), rs.getInt("numero_residencia"), rs.getString("complemento"), rs.getString("bairro"), rs.getString("cep"), rs.getString("cidade"), rs.getString("estado"), rs.getString("usuario"), rs.getString("email"), rs.getString("nivel"));
            clientesBuscados.add(clientes);
        }

        ps.execute();
        ps.close();
        conexao.close();
        return clientesBuscados;
    }

    //Método para remover cliente selecionado em tabela;
    public static void removerCliente() throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "DELETE FROM CLIENTE WHERE CLIENTE_ID = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, clienteidSelecionado);
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }

    //Método para atualizar pessoa selecionada através da tabela;
    public static void atualizarClienteTabela(Cliente clienteEditar) throws SQLException {
        Connection conexao = new Conexao().getConexao();
        String sql = "UPDATE CLIENTE SET NOME = ?, TELEFONE = ?, RG = ?, RUA = ?, NUMERO_RESIDENCIA = ?, COMPLEMENTO = ?, BAIRRO = ?, CEP = ?, CIDADE = ?, ESTADO = ?, EMAIL = ?" + "WHERE CLIENTE_ID = ?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, clienteEditar.getNome());
        ps.setString(2, clienteEditar.getTelefone());
        ps.setString(3, clienteEditar.getRg());
        ps.setString(4, clienteEditar.getRua());
        ps.setInt(5, clienteEditar.getNumero_residencia());
        ps.setString(6, clienteEditar.getComplemento());
        ps.setString(7, clienteEditar.getBairro());
        ps.setString(8, clienteEditar.getCep());
        ps.setString(9, clienteEditar.getCidade());
        ps.setString(10, clienteEditar.getEstado());
        ps.setString(11, clienteEditar.getEmail());
        ps.setInt(12, clienteidSelecionado);
        ps.executeUpdate();
        ps.close();
        conexao.close();
    }
}
