package service;
import model.Solicitacao;

public class EspecialistaSuporteChain implements ISuporteChain{
    @Override
    public void tratarSolicitacao(Solicitacao solicitacao){
        System.out.println("Especialista de Suporte tratando: " + solicitacao.getDescricao());
    }
        
    @Override
    public boolean isResponsavel(Solicitacao solicitacao) {
        if(solicitacao.getTipo().equals("RECLAMACAO_PRODUTO")){
            return true;
        }
        return false;
    }
}
