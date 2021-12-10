package model;

import java.util.Objects;

public class Funcionario {

    private int funcionario_id;
    private String nome;
    private String telefone;
    private String cpf;
    private String usuario;
    private String senha;
    private String email;
    private String nivel;

    public int getFuncionario_id() {
        return funcionario_id;
    }

    public void setFuncionario_id(int funcionario_id) {
        this.funcionario_id = funcionario_id;
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

    @Override
    public String toString() {
        return "Funcionario{" + "funcionario_id=" + funcionario_id + ", nome=" + nome + ", telefone=" + telefone + ", cpf=" + cpf + ", usuario=" + usuario + ", senha=" + senha + ", email=" + email + ", nivel=" + nivel + '}';
    }

    public Funcionario(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Funcionario(String nome, String telefone, String cpf, String usuario, String senha, String email, String nivel) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
        this.nivel = nivel;
    }

    public Funcionario(int funcionario_id, String nome, String telefone, String cpf, String usuario, String email, String nivel) {
        this.funcionario_id = funcionario_id;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.usuario = usuario;
        this.email = email;
        this.nivel = nivel;
    }

    public Funcionario(String nome, String telefone, String cpf, String usuario, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.usuario = usuario;
        this.email = email;
    }

    public Funcionario(int funcionario_id, String nome, String usuario, String nivel) {
        this.funcionario_id = funcionario_id;
        this.nome = nome;
        this.usuario = usuario;
        this.nivel = nivel;
    }

    public Funcionario(String nome, String telefone, String email, String nivel) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.nivel = nivel;
    }

}
