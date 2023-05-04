package service;

import model.Solicitacao;

public class AtendenteSuporteChain implements ISuporteChain{

    @Override
    public void tratarSolicitacao(Solicitacao solicitacao){
        System.out.println("Atendente de Suporte tratando: " + solicitacao.getDescricao());
    }
        
    @Override
    public boolean isResponsavel(Solicitacao solicitacao) {
        if(solicitacao.getTipo().equals("DUVIDA_GERAL")){
            return true;
        }
        return false;
    }
    
}
