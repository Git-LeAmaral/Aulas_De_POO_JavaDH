package carrinhoCompras;

public class Fechado implements EstadoCarrinho {

    Carrinho carrinho;

    public Fechado(Carrinho carrinho) {
        this.carrinho = carrinho;
        System.out.println("Fechado");
    }

    @Override
    public void adicionar(Produto produto) {
        // não muda
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
        carrinho.setEstadoCarrinho(new Vazio(carrinho));
    }
}
