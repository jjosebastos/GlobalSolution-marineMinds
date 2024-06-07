/**
 * Classe "pai" que disponibiliza métodos base para criação
 * das classes filhas PessoaFisica e PessoaJuridica.
 * @author MarineMinds
 * @see com.mrm.model.usuario.PessoaFisica
 * @see com.mrm.model.usuario.PessoaJuridica
 * @version 1.0-SNAPSHOT
 */
package com.mrm.model.usuario;

public  class Usuario {
    private Long idUsuario;
    private String userName;
    private String senha;
    private Endereco endereco;
    private Telefone telefone;

    public Usuario(long idUsuario, String userName, String senha, Endereco endereco, Telefone telefone) {

        this.idUsuario = idUsuario;
        this.userName = userName;
        this.senha = senha;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public  Usuario(){}

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\nUsuario{" +
                "idUsuario=" + idUsuario +
                ", userName='" + userName + '\'' +
                ", senha='" + senha + '\'' +
                ", endereco=" + endereco +
                ", telefone=" + telefone +
                '}' + "\n";
    }
}
