package carrinhoCompras;

public class Vazio implements EstadoCarrinho {

    Carrinho carrinho;

    public Vazio(Carrinho carrinho) {
        this.carrinho = carrinho;
        System.out.println("Vazio");
    }

    @Override
    public void adicionar(Produto produto) {
        carrinho.setEstadoCarrinho(new Carregando(carrinho));
    }

    @Override
    public void cancelar() {
        // não muda
    }

    @Override
    public void retornar() {
        // não muda
    }

    @Override
    public void avancar() {
        // não muda
    }
}
