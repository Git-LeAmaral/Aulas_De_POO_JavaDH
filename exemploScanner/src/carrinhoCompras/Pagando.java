package carrinhoCompras;

public class Pagando implements EstadoCarrinho {

    Carrinho carrinho;

    public Pagando(Carrinho carrinho) {
        this.carrinho = carrinho;
        System.out.println("Pagando");
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
        carrinho.setEstadoCarrinho(new Carregando(carrinho));
    }

    @Override
    public void avancar() {
        carrinho.setEstadoCarrinho(new Fechado(carrinho));
    }
}
