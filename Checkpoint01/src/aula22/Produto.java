package aula22;

public class Produto extends Item {

    private double preco;

    public Produto(String nome, double preco) {
        super(nome);
        this.preco = preco;
    }

    @Override
    public double calcularPreco() {
        return preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
