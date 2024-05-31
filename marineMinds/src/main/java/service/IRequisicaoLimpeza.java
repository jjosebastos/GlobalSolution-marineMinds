package service;

import model.RequisicaoLimpeza;

public interface IRequisicaoLimpeza {
    void adicionarRequisicao(RequisicaoLimpeza requisicaoLimpeza);
    void atualizarRequisicao(long idRequisicao);
    void removerRequisicao(Long id);
}
