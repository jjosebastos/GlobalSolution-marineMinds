package com.mrm.service;

import com.mrm.model.RequisicaoLimpeza;

public interface IRequisicaoLimpeza {
    void adicionarRequisicao(RequisicaoLimpeza requisicaoLimpeza);
    void removerRequisicao(Long id);
}
