package model.arquivos;

import model.usuario.Endereco;
import model.usuario.Telefone;
import model.usuario.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
    Usuario usuarioSetUp;
    Endereco enderecoSetUp;
    Telefone telefoneSetUp;
    @BeforeEach
    void setUp(){
        enderecoSetUp = new Endereco(1l, "Rua das flores", "236", "Rosário", "São Paulo", "08430-170", "SP" );
        telefoneSetUp = new Telefone(1L, "55", "11", "4174-1009", "Celular");
        usuarioSetUp = new Usuario(1l, "jjosebastos", "12345678", enderecoSetUp, telefoneSetUp);
    }

    @Test
    void checar_nome_de_usuario(){
        Assertions.assertEquals("jjosebastos", usuarioSetUp.getUserName());
    }

    @Test
    void checar_senha(){
        Assertions.assertEquals("12345678", usuarioSetUp.getSenha());
    }

    @Test
    void checar_telefone(){
        Assertions.assertNotEquals("4172-9415", usuarioSetUp.getTelefone().getNumero());
        Assertions.assertEquals("11", usuarioSetUp.getTelefone().getDdd());
        Assertions.assertEquals("Celular", usuarioSetUp.getTelefone().getTipo());
        Assertions.assertEquals("55", usuarioSetUp.getTelefone().getDdi());
        Assertions.assertEquals(1l, usuarioSetUp.getTelefone().getIdTelefone());
    }

    @Test
    void sets_telefone(){
        usuarioSetUp.setIdUsuario(2L);
        Assertions.assertEquals(2L, usuarioSetUp.getIdUsuario());
        Assertions.assertNotEquals("4172-9415", usuarioSetUp.getTelefone().getDdd());
        Assertions.assertNotEquals("4172-9415", usuarioSetUp.getTelefone().getTipo());
        Assertions.assertNotEquals("4172-9415", usuarioSetUp.getTelefone().getDdi());
        Assertions.assertNotEquals("4172-9415", usuarioSetUp.getTelefone().getIdTelefone());
    }
}
