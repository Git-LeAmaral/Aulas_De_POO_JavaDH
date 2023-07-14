package carrinhoCompras;

public class Main {

    public static void main(String[] args) {

        Carrinho carrinho1 = new Carrinho();

        Produto produto1 = new Produto("Leite", 5.30);
        Produto produto2 = new Produto("Arroz", 12.50);
        Produto produto3 = new Produto("Feijão", 8.90);

        carrinho1.adicionar(produto1);
        carrinho1.adicionar(produto2);
        carrinho1.adicionar(produto3);
        carrinho1.mostrarProduto();

        //carrinho1.avancar();
        //carrinho1.avancar();

    }
}
