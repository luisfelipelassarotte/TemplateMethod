package TemplateMethod;

public class UsuarioCliente extends Usuario {

    public String verificarStatus() {
        if (this.isAdmin() == true) {
            return "Usuário é admin, porem em pagina de cliente";
        }
        else {
            return "Usuário comum";
        }
    }

}
