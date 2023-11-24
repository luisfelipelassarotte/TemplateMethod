package TemplateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioAdminTest {

    @Test
    void deveRetornarAdmin() {
        UsuarioAdmin usuario = new UsuarioAdmin();
        usuario.setAdmin(true);
        assertEquals("Admin", usuario.verificarStatus());
    }

    @Test
    void deveRetornarSemPermissao() {
        UsuarioAdmin usuario = new UsuarioAdmin();
        usuario.setAdmin(false);
        assertEquals("Sem permissão de admin", usuario.verificarStatus());
    }

    @Test
    void deveRetornarInformacoes() {
        UsuarioAdmin usuario = new UsuarioAdmin();
        usuario.setNome("Cleitinho");
        usuario.setSenha("123");
        usuario.setAdmin(true);
        assertEquals("Usuário Admin{nome = 'Cleitinho', status = Admin}", usuario.getInfo());
    }

}