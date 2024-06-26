/**
 * Classe que herda da classe Usuario para criar
 * um usuário pessoa jurídica de acordo com os padrões brasileiros.
 * @author MarineMinds
 * @see com.mrm.model.usuario.Usuario
 * @version 1.0-SNAPSHOT
 */
package com.mrm.model.usuario;

public class PessoaJuridica extends Usuario{
    private String cnpj;
    private String inscricaoEstadual;
    private String razaoSocial;

    public PessoaJuridica(String cnpj, String inscricaoEstadual, String razaoSocial, long idUsuario, String userName, String senha, Endereco endereco, Telefone telefone) {
        super(idUsuario, userName, senha, endereco, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
