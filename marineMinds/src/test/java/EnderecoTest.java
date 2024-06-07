import com.mrm.model.usuario.Endereco;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EnderecoTest {

    Endereco enderecoSetup;

    @BeforeEach
    void setUp(){
        enderecoSetup = new Endereco();
        enderecoSetup.setRua("Rua das flores");
        enderecoSetup.setNumero("23");
        enderecoSetup.setBairro("Jardins");
        enderecoSetup.setCidade("São Paulo");
        enderecoSetup.setUf("SP");
        enderecoSetup.setCep("08430-170");
    }

    @Test
    void getters_endereco_rua_das_flores(){
        Assertions.assertEquals("Rua das flores", enderecoSetup.getRua());
    }

    @Test
    void getters_endereco_numero_23_da_casa(){
        Assertions.assertEquals("23", enderecoSetup.getNumero());
    }

    @Test
    void getters_endereco_cidade_sao_paulo(){
        Assertions.assertEquals("São Paulo", enderecoSetup.getCidade());
    }

    @Test
    void getters_endereco_uf_sp(){
        Assertions.assertEquals("SP", enderecoSetup.getUf());
    }

    @Test
    void getters_endereco_bairro_jardins(){
        Assertions.assertEquals("08430-170", enderecoSetup.getCep());
    }
}
