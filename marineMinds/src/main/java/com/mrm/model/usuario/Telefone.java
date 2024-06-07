package com.mrm.model.usuario;

public class Telefone {
    private String ddi;
    private String ddd;
    private String numeroTelefone;
    private String tipo;

    public Telefone(String ddi, String ddd, String numeroTelefone, String tipo) {
        this.ddi = ddi;
        this.ddd = ddd;
        this.numeroTelefone = numeroTelefone;
        this.tipo = tipo;
    }

    public Telefone(){}

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
        return numeroTelefone;
    }

    public void setNumero(String numero) {
        this.numeroTelefone = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\nTelefone{" +
                "ddi='" + ddi + '\'' +
                ", ddd='" + ddd + '\'' +
                ", numeroTelefone='" + numeroTelefone + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
