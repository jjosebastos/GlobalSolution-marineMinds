package service;

import model.RequisicaoLimpeza;

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
    public void atualizarRequisicao(long idRequisicao) {

        if (!listRequisicaoLimpeza.isEmpty()){
            for (: listRequisicaoLimpeza){
                if(s.equalsIgnoreCase())
            }
        }
    }

    @Override
    public void removerRequisicao(Long id) {

    }
}
