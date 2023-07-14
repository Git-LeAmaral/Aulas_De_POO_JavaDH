package adicionandoProdutosTeste;

import lojaDeRoupas.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntradaProdutos {

    private List<ProdutoTeste> listaProdutos;

    public static void main(String[] args) {
        EntradaProdutos produto = new EntradaProdutos();

        produto.obterProdutos();
        produto.exibirProdutos();
    }

    public void obterProdutos() {
        Scanner scanner = new Scanner(System.in);
        listaProdutos = new ArrayList<>();

        System.out.println("Digite quantos produtos: ");
        int quantidadeProdutos = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < quantidadeProdutos; i++) {

            System.out.print("Produto #" + (i + 1));

            System.out.print("Digite o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o preço do produto: ");
            double preco = scanner.nextDouble();

            System.out.print("Digite a quantidade: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            ProdutoTeste produto = new ProdutoTeste(nome, preco, quantidade);
            listaProdutos.add(produto);
        }
    }

    public void exibirProdutos() {
        for (int i = 0; i < listaProdutos.size(); i++) {
            ProdutoTeste produto = listaProdutos.get(i);

            System.out.println("Produto " + (i + 1));
            System.out.println("Descrição: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("---------------------------");
        }
    }
}
