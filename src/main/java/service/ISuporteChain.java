package service;
import model.Solicitacao;

public interface ISuporteChain {
    public void tratarSolicitacao(Solicitacao solicitacao);
    public boolean isResponsavel(Solicitacao solicitacao);
}
