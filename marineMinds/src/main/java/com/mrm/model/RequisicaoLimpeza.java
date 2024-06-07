package com.mrm.model;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class RequisicaoLimpeza {
    private Long idRequisicao;
    private String descricao;
    private LocalDate data;
    private LocalTime hora;
    private String tipoLixo;
    private  Localizacao localizacao;

    public RequisicaoLimpeza(Long idRequisicao, String descricao, LocalDate data, LocalTime hora, String tipoLixo, Localizacao localizacao) {
        this.idRequisicao = idRequisicao;
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
        this.tipoLixo = tipoLixo;
        this.localizacao = localizacao;
    }

    public RequisicaoLimpeza(){}

    public Long getIdRequisicao() {
        return idRequisicao;
    }

    public void setIdRequisicao(Long idRequisicao) {
        this.idRequisicao = idRequisicao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getTipoLixo() {
        return tipoLixo;
    }

    public void setTipoLixo(String tipoLixo) {
        this.tipoLixo = tipoLixo;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "\nRequisicaoLimpeza{" +
                "idRequisicao=" + idRequisicao +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                ", hora=" + hora +
                ", tipoLixo='" + tipoLixo + '\'' +
                ", localizacao=" + localizacao +
                '}';
    }
}
