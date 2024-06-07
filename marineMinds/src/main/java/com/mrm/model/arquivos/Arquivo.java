/**
 * Pacote que contem uma classe abstrata "Arquivo" onde Imagem
 * e Video herdam seus respectivos atributos e métodos
 * @author MarineMinds
 * @see com.mrm.model.arquivos.Imagem
 * @see com.mrm.model.arquivos.Video
 * @version 1.0-SNAPSHOT
 */
package com.mrm.model.arquivos;



public abstract class Arquivo { ;
    private String nome;
    private String tipo;
    private int tamanho;


    /**
     *
     * @param nome
     * @param tipo
     * @param tamanho
     * @throws RuntimeException se o "tamanho" do arquivo for maior que 50mb.
     */

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
