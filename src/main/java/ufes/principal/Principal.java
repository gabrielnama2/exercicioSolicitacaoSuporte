package ufes.principal;
import model.Solicitacao;
import service.AtendenteSuporteChain;
import service.AtendimentoSuporteService;
import service.EspecialistaSuporteChain;
import service.GerenteSuporteChain;
import service.ISuporteChain;

public class Principal {

    public static void main(String[] args) {
        // Cria os objetos de suporte
        ISuporteChain atendente = new AtendenteSuporteChain();
        ISuporteChain especialista = new EspecialistaSuporteChain();
        ISuporteChain gerente = new GerenteSuporteChain();
        
        // Cria as solicitações
        Solicitacao solicitacao1 = new Solicitacao("Cliente com dúvida sobre produto", "DUVIDA_GERAL");
        Solicitacao solicitacao2  = new Solicitacao("Cliente insatisfeito com a qualidade do produto", "RECLAMACAO_PRODUTO");
        Solicitacao solicitacao3 = new Solicitacao("Cliente quer devolver produto", "SOLICITACAO_DEVOLUCAO");
        
        //Cria a service de atendimento
        AtendimentoSuporteService atendimento = new AtendimentoSuporteService();
        
        //Adiciona os atendentes de suporte
        atendimento.addSuporte(atendente);
        atendimento.addSuporte(especialista);
        atendimento.addSuporte(gerente);
        
        //Adiciona as solicitações
        atendimento.addSolicitacao(solicitacao3);
        atendimento.addSolicitacao(solicitacao1);
        atendimento.addSolicitacao(solicitacao2);
        
        //Atende as solicitações
        atendimento.tratarSolicitacao();
    }
}
