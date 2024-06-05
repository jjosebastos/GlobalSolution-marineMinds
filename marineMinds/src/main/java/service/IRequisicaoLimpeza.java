package service;

import model.RequisicaoLimpeza;

public interface IRequisicaoLimpeza {
    void adicionarRequisicao(RequisicaoLimpeza requisicaoLimpeza);
    void removerRequisicao(Long id);
}
