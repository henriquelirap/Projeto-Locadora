package model;

import java.util.Objects;

public class Veiculo {

    private int veiculo_id;
    private String nome;
    private String modelo;
    private String ano;
    private String marca;
    private double valor_diaria;
    private String status;
    private String cliente_em_posse;

    public String getCliente_em_posse() {
        return cliente_em_posse;
    }

    public void setCliente_em_posse(String cliente_em_posse) {
        this.cliente_em_posse = cliente_em_posse;
    }

    public int getVeiculo_id() {
        return veiculo_id;
    }

    public void setVeiculo_id(int veiculo_id) {
        this.veiculo_id = veiculo_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor_diaria() {
        return valor_diaria;
    }

    public void setValor_diaria(double valor_diaria) {
        this.valor_diaria = valor_diaria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return marca + " " + nome + " - " + modelo + " - " + ano;
    }

    public Veiculo(int veiculo_id, String nome, String modelo, String ano, String marca, double valor_diaria, String status, String cliente_em_posse) {
        this.veiculo_id = veiculo_id;
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
        this.valor_diaria = valor_diaria;
        this.status = status;
        this.cliente_em_posse = cliente_em_posse;
    }

    public Veiculo(String nome, String modelo, String ano, String marca, double valor_diaria, String status) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
        this.valor_diaria = valor_diaria;
        this.status = status;
    }
}
