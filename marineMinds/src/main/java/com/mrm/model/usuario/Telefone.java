package com.mrm.model.usuario;

public class Telefone {
    private String ddi;
    private String ddd;
    private String numero;
    private String tipo;

    public Telefone(String ddi, String ddd, String numero, String tipo) {
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
    }


    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
