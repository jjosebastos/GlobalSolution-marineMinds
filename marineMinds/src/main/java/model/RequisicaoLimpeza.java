package model;

public class RequisicaoLimpeza {
    private Long idRequisicao;
    private String descricao;
    private String data;
    private String hora;
    private String tipoLixo;

    public RequisicaoLimpeza(Long idRequisicao, String descricao, String data, String hora, String tipoLixo) {
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipoLixo() {
        return tipoLixo;
    }

    public void setTipoLixo(String tipoLixo) {
        this.tipoLixo = tipoLixo;
    }
}
