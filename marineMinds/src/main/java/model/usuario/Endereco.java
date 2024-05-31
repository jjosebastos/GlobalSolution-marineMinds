package model.usuario;

public class Endereco {
    private Long idEndereco;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String cep;

    public Endereco(Long idEndereco, String rua, String numero, String bairro, String cidade, String cep) {
        this.idEndereco = idEndereco;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }


}
