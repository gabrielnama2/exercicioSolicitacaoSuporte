package model;

public class Solicitacao {
    private String descricao;
    private String tipo;
    
    public Solicitacao(String descricao, String tipo){
        this.descricao = descricao;
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public String getDescricao(){
        return this.descricao;
    }
}
