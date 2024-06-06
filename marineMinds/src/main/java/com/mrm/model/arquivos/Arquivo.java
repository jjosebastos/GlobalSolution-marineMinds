package com.mrm.model.arquivos;

public abstract class Arquivo {
    private Long idArquivo;
    private String nome;
    private String tipo;
    private int tamanho;

    public Arquivo(Long idArquivo, String nome, String tipo, int tamanho) {
        this.idArquivo = idArquivo;
        this.nome = nome;
        this.tipo = tipo;
        this.tamanho = tamanho;
        if (tamanho > 50) {
            throw new RuntimeException("Selecionar arquivos menores que 50MB");
        }

    }

    public Long getIdArquivo() {
        return idArquivo;
    }

    public void setIdArquivo(Long idArquivo) {
        this.idArquivo = idArquivo;
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
