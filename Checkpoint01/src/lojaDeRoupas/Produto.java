package lojaDeRoupas;

public class Produto {

    private String tipo;
    private double preco;
    private int quantidade;

    public Produto(String tipo, double preco, int quantidade) {
        this.tipo = tipo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    public void atualizarQuantidade( int quantidade) {
        this.quantidade = this.quantidade - quantidade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getTipo() {
        return tipo;
    }


    public double getPreco() {
        return preco;
    }

}
