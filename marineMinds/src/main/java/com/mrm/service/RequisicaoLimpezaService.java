package com.mrm.service;

import com.mrm.model.RequisicaoLimpeza;

import java.util.ArrayList;
import java.util.List;

public class RequisicaoLimpezaService implements  IRequisicaoLimpeza{
    List<RequisicaoLimpeza> listRequisicaoLimpeza;

    public RequisicaoLimpezaService(){
        this.listRequisicaoLimpeza = new ArrayList<>();
    }

    /**
     * @author MarineMinds
     * @param requisicaoLimpeza
     * @return void Método para criar uma nova RequisicaoLimpeza
     * @version 1.0-SNAPSHOT
     */
    @Override
    public void adicionarRequisicao(RequisicaoLimpeza requisicaoLimpeza) {
        listRequisicaoLimpeza.add(requisicaoLimpeza);
    }

    /**
     * @param idRemocao
     * @return void Método para remover uma requisição com base no id
     * @version 1.0-SNAPSHOT
     */
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

    /**
     * Método que retorna todas as requisições feitas.
     * @version 1.0-SNAPSHOT
     */
    @Override
    public void pesquisarRequisicoes() {
        System.out.println(listRequisicaoLimpeza);
    }
}
