package aula22;

public class Main {

    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();

        Item item1 = new Produto("X-Tudo", 22.00);
        Item item2 = new Produto("X-Salada", 18.00);
        Item item3 = new Produto("Suco Laranja 1Ltr", 13.90);
        Item item4 = new Produto("Coca 2Ltr", 10.50);

        Item combo = new Combo("X-Salada + Suco ");

        ((Combo) combo).inserirItem(item2);
        ((Combo) combo).inserirItem(item3);

        carrinho.addItem(combo);
        carrinho.addItem(item1);
        carrinho.mostrarItem();
        System.out.println("Valor total da compra é de R$: " + carrinho.valorTotal());
    }
}
