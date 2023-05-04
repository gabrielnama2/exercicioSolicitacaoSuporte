package service;
import model.Solicitacao;

public class GerenteSuporteChain implements ISuporteChain{
    @Override
    public void tratarSolicitacao(Solicitacao solicitacao){
        System.out.println("Gerente de Suporte tratando: " + solicitacao.getDescricao());
    }
        
    @Override
    public boolean isResponsavel(Solicitacao solicitacao) {
        if(solicitacao.getTipo().equals("SOLICITACAO_DEVOLUCAO")){
            return true;
        }
        return false;
    }
}
