package model.usuario;

import java.util.HashMap;
import java.util.Map;

public class Usuario {
    private long idUsuario;
    private String nome;
    private String userName;
    private String senha;
    private String cpf;
    private Endereco endereco;
    private Telefone telefone;

    Map<Long, Usuario> mapUsuario = new HashMap<>();

    public Usuario(long idUsuario, String nome, String userName, String senha, String cpf, Endereco endereco, Telefone telefone) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.userName = userName;
        this.senha = senha;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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


}
