package aula05Playground;

public class Artigo {

    private String descricao;
    private double precoVenda;
    private int estoque;

    public Artigo(String descricao, double preco, int estoque){
        this.descricao = descricao;
        precoVenda = preco;
        this.estoque = estoque;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public boolean temEstoque(){
        return estoque > 0;
    }

    public double consultarPreco(){
        return precoVenda;
    }
}
