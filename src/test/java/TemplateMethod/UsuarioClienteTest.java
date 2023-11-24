package TemplateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioClienteTest {

    @Test
    void deveRetornarAdmin() {
        UsuarioCliente usuario = new UsuarioCliente();
        usuario.setAdmin(true);
        assertEquals("Usuário é admin, porem em pagina de cliente", usuario.verificarStatus());
    }

    @Test
    void deveRetornarSemPermissao() {
        UsuarioCliente usuario = new UsuarioCliente();
        usuario.setAdmin(false);
        assertEquals("Usuário comum", usuario.verificarStatus());
    }

    @Test
    void deveRetornarInformacoes() {
        UsuarioCliente usuario = new UsuarioCliente();
        usuario.setNome("Cleitinho");
        usuario.setSenha("123");
        usuario.setAdmin(false);
        assertEquals("Usuario{nome = 'Cleitinho', status = Usuário comum}", usuario.getInfo());
    }

}