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

    public RequisicaoLimpeza(Long idRequisicao, String descricao, LocalDate data, LocalTime hora, String tipoLixo) {
        this.idRequisicao = idRequisicao;
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
        this.tipoLixo = tipoLixo;
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

    @Override
    public String toString() {
        return "RequisicaoLimpeza{" +
                "idRequisicao=" + idRequisicao +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                ", hora=" + hora +
                ", tipoLixo='" + tipoLixo + '\'' +
                '}';
    }
}
