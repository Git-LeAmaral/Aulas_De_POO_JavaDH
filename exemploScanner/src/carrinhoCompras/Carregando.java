package carrinhoCompras;

public class Carregando implements EstadoCarrinho {

    Carrinho carrinho;

    public Carregando(Carrinho carrinho) {
        this.carrinho = carrinho;
        System.out.println("Carregando");
    }

    @Override
    public void adicionar(Produto produto) {
        // não muda
    }

    @Override
    public void cancelar() {
        carrinho.setEstadoCarrinho(new Vazio(carrinho));
    }

    @Override
    public void retornar() {
        carrinho.setEstadoCarrinho(new Vazio(carrinho));
    }

    @Override
    public void avancar() {
        carrinho.setEstadoCarrinho(new Pagando(carrinho));
    }
}
