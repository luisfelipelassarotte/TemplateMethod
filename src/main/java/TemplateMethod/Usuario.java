package TemplateMethod;

public abstract class Usuario {

    private String nome;
    private String senha;
    private boolean admin;

    public boolean isAdmin() {
        return admin;
    }

    public Usuario setAdmin(boolean admin) {
        this.admin = admin;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Usuario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public Usuario setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public abstract String verificarStatus();

    public String getTipo() {
        return "Usuario";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "nome = '" + this.nome + '\'' +
                ", status = " + this.verificarStatus() +
                '}';
    }

}
