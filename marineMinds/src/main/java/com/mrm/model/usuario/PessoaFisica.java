/**
 * Classe que herda da classe Usuario para criar
 * um usuário pessoa física de acordo com os padrões brasileiros.
 * @author MarineMinds
 * @see com.mrm.model.usuario.Usuario
 * @version 1.0-SNAPSHOT
 */
package com.mrm.model.usuario;

public class PessoaFisica extends Usuario{
    private String nome;
    private String cpf;

    public PessoaFisica(String nome, String cpf, long idUsuario, String userName, String senha, Endereco endereco, Telefone telefone) {
        super(idUsuario, userName, senha, endereco, telefone);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
