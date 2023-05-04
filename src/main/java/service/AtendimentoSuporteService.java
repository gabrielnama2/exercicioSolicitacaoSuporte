package service;
import java.util.ArrayList;
import model.Solicitacao;

public class AtendimentoSuporteService {
    private ArrayList<ISuporteChain> suportes;
    private ArrayList<Solicitacao> solicitacoes;
    
    public AtendimentoSuporteService(){
        suportes = new ArrayList();
        solicitacoes = new ArrayList();
    }
    
    public void tratarSolicitacao(){
        for(int i=0; i<solicitacoes.size(); i++){
            for(int j=0; j<suportes.size(); j++){
                if(suportes.get(j).isResponsavel(solicitacoes.get(i))){
                    suportes.get(j).tratarSolicitacao(solicitacoes.get(i));
                    break;
                }
            }
        }
    }
    public void addSuporte(ISuporteChain novoSuporte){
        suportes.add(novoSuporte);
    }
    public void addSolicitacao(Solicitacao novaSolicitacao){
        solicitacoes.add(novaSolicitacao);
    }
}
