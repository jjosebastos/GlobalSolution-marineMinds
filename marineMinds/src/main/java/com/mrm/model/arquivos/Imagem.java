package com.mrm.model.arquivos;

public class Imagem extends Arquivo {
    private String formato;

    public Imagem(String nome, String tipo, int tamanho, String formato) {
        super(nome, tipo, tamanho);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
