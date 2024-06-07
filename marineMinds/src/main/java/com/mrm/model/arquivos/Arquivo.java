package com.mrm.model.arquivos;

public abstract class Arquivo { ;
    private String nome;
    private String tipo;
    private int tamanho;

    public Arquivo( String nome, String tipo, int tamanho) {
        this.nome = nome;
        this.tipo = tipo;
        this.tamanho = tamanho;
        if (tamanho > 50) {
            throw new RuntimeException("Selecionar arquivos menores que 50MB");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

}
