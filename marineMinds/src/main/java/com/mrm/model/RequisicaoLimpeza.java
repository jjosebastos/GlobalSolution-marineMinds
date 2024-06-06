package com.mrm.model;

import java.sql.Time;
import java.util.Date;

public class RequisicaoLimpeza {
    private Long idRequisicao;
    private String descricao;
    private Date data;
    private Time hora;
    private String tipoLixo;

    public RequisicaoLimpeza(Long idRequisicao, String descricao, Date data, Time hora, String tipoLixo) {
        this.idRequisicao = idRequisicao;
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
        this.tipoLixo = tipoLixo;
    }

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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getTipoLixo() {
        return tipoLixo;
    }

    public void setTipoLixo(String tipoLixo) {
        this.tipoLixo = tipoLixo;
    }
}
