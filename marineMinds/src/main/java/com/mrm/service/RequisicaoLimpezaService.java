package com.mrm.service;

import com.mrm.model.RequisicaoLimpeza;

import java.util.ArrayList;
import java.util.List;

public class RequisicaoLimpezaService implements  IRequisicaoLimpeza{
    List<RequisicaoLimpeza> listRequisicaoLimpeza;

    public RequisicaoLimpezaService(){
        this.listRequisicaoLimpeza = new ArrayList<>();
    }

    @Override
    public void adicionarRequisicao(RequisicaoLimpeza requisicaoLimpeza) {
        listRequisicaoLimpeza.add(requisicaoLimpeza);
    }

    @Override
    public void removerRequisicao(Long idRemocao) {
        List<RequisicaoLimpeza> listRemocao = new ArrayList<>();

        if (listRequisicaoLimpeza.isEmpty()){
            for(RequisicaoLimpeza rl: listRequisicaoLimpeza){
                if(rl.getIdRequisicao() == idRemocao){
                    listRequisicaoLimpeza.remove(rl);
                }
            }
            listRequisicaoLimpeza.removeAll(listRemocao);
        } else {
            throw new RuntimeException("Lista vazia, por gentileza informar uma lista válida");
        }
    }

    @Override
    public void pesquisarRequisicoes() {
        System.out.println(listRequisicaoLimpeza);
    }
}
