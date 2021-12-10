package model;

public class Caixa {

    private String data;
    private double dinheiro;
    private double cartao;

    @Override
    public String toString() {
        return "Caixa{" + ", data=" + data + ", dinheiro=" + dinheiro + ", cartao=" + cartao + '}';
    }

    public Caixa(double dinheiro, double cartao) {
        this.dinheiro = dinheiro;
        this.cartao = cartao;
    }

    public Caixa(String data, double dinheiro) {
        this.data = data;
        this.dinheiro = dinheiro;
    }

    public Caixa(String data, double dinheiro, double cartao) {
        this.data = data;
        this.dinheiro = dinheiro;
        this.cartao = cartao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public double getCartao() {
        return cartao;
    }

    public void setCartao(double cartao) {
        this.cartao = cartao;
    }

}
