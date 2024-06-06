package com.mrm.model.arquivos;

import java.sql.Time;

public class Video extends Arquivo {
    private Time duracao;
    private String formato;

    public Video(Long idArquivo, String nome, String tipo, int tamanho, Time duracao, String formato) {
        super(idArquivo, nome, tipo, tamanho);
    }

    public Time getDuracao() {
        return duracao;
    }

    public void setDuracao(Time duracao) {
        this.duracao = duracao;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
