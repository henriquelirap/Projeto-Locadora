package model;

public class Email {

    private String usuario;
    private String email;
    private String senha;

    @Override
    public String toString() {
        return "Email{" + "usuario=" + usuario + ", email=" + email + ", senha=" + senha + '}';
    }

    public Email(String usuario, String email, String senha) {
        this.usuario = usuario;
        this.email = email;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
