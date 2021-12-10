package model;

import java.util.Date;

public class Locacao {

    private int locacao_id;
    private int cliente_id;
    private String nome_cliente;
    private String usuario;
    private int veiculo_id;
    private String nome_veiculo;
    private Double valor_diaria;
    private String data_locacao;
    private String data_devolucao;
    private double valor_total;
    private String pagamento;
    private String status;

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public Locacao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public Locacao(int locacao_id, int cliente_id, String nome_cliente, String usuario, int veiculo_id, String nome_veiculo, Double valor_diaria, String data_locacao, String data_devolucao, double valor_total, String pagamento, String status) {
        this.locacao_id = locacao_id;
        this.cliente_id = cliente_id;
        this.nome_cliente = nome_cliente;
        this.usuario = usuario;
        this.veiculo_id = veiculo_id;
        this.nome_veiculo = nome_veiculo;
        this.valor_diaria = valor_diaria;
        this.data_locacao = data_locacao;
        this.data_devolucao = data_devolucao;
        this.valor_total = valor_total;
        this.pagamento = pagamento;
        this.status = status;
    }

    public Locacao(int locacao_id, int cliente_id, String nome_cliente, String usuario, int veiculo_id, String nome_veiculo, String data_locacao, String data_devolucao, double valor_total) {
        this.locacao_id = locacao_id;
        this.cliente_id = cliente_id;
        this.nome_cliente = nome_cliente;
        this.usuario = usuario;
        this.veiculo_id = veiculo_id;
        this.nome_veiculo = nome_veiculo;
        this.data_locacao = data_locacao;
        this.data_devolucao = data_devolucao;
        this.valor_total = valor_total;

    }

    public Double getValor_diaria() {
        return valor_diaria;
    }

    public void setValor_diaria(Double valor_diaria) {
        this.valor_diaria = valor_diaria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getLocacao_id() {
        return locacao_id;
    }

    public void setLocacao_id(int locacao_id) {
        this.locacao_id = locacao_id;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getVeiculo_id() {
        return veiculo_id;
    }

    public void setVeiculo_id(int veiculo_id) {
        this.veiculo_id = veiculo_id;
    }

    public String getNome_veiculo() {
        return nome_veiculo;
    }

    public void setNome_veiculo(String nome_veiculo) {
        this.nome_veiculo = nome_veiculo;
    }

    public String getData_locacao() {
        return data_locacao;
    }

    public void setData_locacao(String data_locacao) {
        this.data_locacao = data_locacao;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    @Override
    public String toString() {
        return "Locacao{" + "locacao_id=" + locacao_id + ", cliente_id=" + cliente_id + ", nome_cliente=" + nome_cliente + ", usuario=" + usuario + ", veiculo_id=" + veiculo_id + ", nome_veiculo=" + nome_veiculo + ", data_locacao=" + data_locacao + ", data_devolucao=" + data_devolucao + ", valor_total=" + valor_total + '}';
    }

    public Locacao(int cliente_id, String nome_cliente, String usuario, int veiculo_id, String nome_veiculo, double valor_diaria, String data_locacao, String data_devolucao, double valor_total, String status) {
        this.cliente_id = cliente_id;
        this.nome_cliente = nome_cliente;
        this.usuario = usuario;
        this.veiculo_id = veiculo_id;
        this.nome_veiculo = nome_veiculo;
        this.valor_diaria = valor_diaria;
        this.data_locacao = data_locacao;
        this.data_devolucao = data_devolucao;
        this.valor_total = valor_total;
        this.status = status;
    }

    public Locacao(int locacao_id, int cliente_id, String nome_cliente, String usuario, int veiculo_id, String nome_veiculo, double valor_diaria, String data_locacao, String data_devolucao, double valor_total, String status) {
        this.locacao_id = locacao_id;
        this.cliente_id = cliente_id;
        this.nome_cliente = nome_cliente;
        this.usuario = usuario;
        this.veiculo_id = veiculo_id;
        this.nome_veiculo = nome_veiculo;
        this.valor_diaria = valor_diaria;
        this.data_locacao = data_locacao;
        this.data_devolucao = data_devolucao;
        this.valor_total = valor_total;
        this.status = status;
    }

}
