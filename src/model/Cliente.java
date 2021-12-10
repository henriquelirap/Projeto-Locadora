package model;

import java.util.Objects;

public class Cliente {

    private int cliente_id;
    private String nome;
    private String telefone;
    private String cpf;
    private String rg;
    private String rua;
    private int numero_residencia;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private String usuario;
    private String senha;
    private String email;
    private String nivel;

    @Override
    public String toString() {
        return "Cliente{" + "cliente_id=" + cliente_id + ", nome=" + nome + ", telefone=" + telefone + ", cpf=" + cpf + ", rg=" + rg + ", rua=" + rua + ", numero_residencia=" + numero_residencia + ", complemento=" + complemento + ", bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", estado=" + estado + ", usuario=" + usuario + ", senha=" + senha + ", email=" + email + ", nivel=" + nivel + '}';
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero_residencia() {
        return numero_residencia;
    }

    public void setNumero_residencia(int numero_residencia) {
        this.numero_residencia = numero_residencia;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Cliente(String nome, String telefone, String rg, String rua, int numero_residencia, String complemento, String bairro, String cep, String cidade, String estado, String usuario, String email, String nivel) {
        this.nome = nome;
        this.telefone = telefone;
        this.rg = rg;
        this.rua = rua;
        this.numero_residencia = numero_residencia;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.usuario = usuario;
        this.email = email;
        this.nivel = nivel;
    }

    public Cliente(String nome, String telefone, String cpf, String rg, String rua, int numero_residencia, String complemento, String bairro, String cep, String cidade, String estado, String usuario, String senha, String email, String nivel) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
        this.rua = rua;
        this.numero_residencia = numero_residencia;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
        this.nivel = nivel;
    }

    public Cliente(String nome, String telefone, String rg, String rua, int numero_residencia, String complemento, String bairro, String cep, String cidade, String estado, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.rg = rg;
        this.rua = rua;
        this.numero_residencia = numero_residencia;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.email = email;
    }

    public Cliente(int cliente_id, String nome, String usuario, String nivel) {
        this.cliente_id = cliente_id;
        this.nome = nome;
        this.usuario = usuario;
        this.nivel = nivel;
    }

    public Cliente(String nome, String telefone, String cpf, String rg, String rua, int numero_residencia, String complemento, String bairro, String cep, String cidade, String estado, String usuario, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
        this.rua = rua;
        this.numero_residencia = numero_residencia;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.usuario = usuario;
        this.email = email;
    }

    public Cliente(int cliente_id, String nome, String telefone, String cpf, String rg, String rua, int numero_residencia, String complemento, String bairro, String cep, String cidade, String estado, String usuario, String email, String nivel) {
        this.cliente_id = cliente_id;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
        this.rua = rua;
        this.numero_residencia = numero_residencia;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.usuario = usuario;
        this.email = email;
        this.nivel = nivel;
    }

}
