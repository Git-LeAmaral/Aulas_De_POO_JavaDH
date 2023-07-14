package listaDeProdutos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeProdutos {

    public static void main(String[] args) {
        // Criando a lista de produtos
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();


        produtos.add(new Produto("Camiseta Branca", 12.99, 10));
        produtos.add(new Produto("Calça Jeans", 59.90, 10));
        produtos.add(new Produto("Vestido Longo", 15.99, 10));

        // Exibindo a lista de produtos ao usuário

/*
        do {
            System.out.println("Lista de Produtos: ");
            for (int i = 0; i < produtos.size(); i++) {
                Produto produto = produtos.get(i);
                System.out.println((i + 1) + ". " + produto.getNome() + " - R$" + produto.getPreco() + "Quantidade: " + produto.getQuantidade());
            }
            System.out.println("0. Finalizar a compra");


            // Solicitando a opção e quantidade ao usuário
            int opcao;
            int quantidade;
            do {
                System.out.print("Digite o número do produto desejado: ");
                opcao = scanner.nextInt();

                if (opcao < 0 || opcao > produtos.size()) {
                    System.out.println("Opção inválida! Digite novamente");
                }

            } while (opcao < 0 || opcao > produtos.size());

            if (opcao == 0) {
                System.out.println("Compra finalizada");
                break;
            }

            do {
                System.out.print("Digite a quantidade desejada: ");
                int quantidade = scanner.nextInt();
            } while (quantidade < 0 || quantidade > produtos.getQuantidade.size());



            // Validando a opção selecionada pelo usuário
            if (opcao >= 1 && opcao <= produtos.size()) {
                Produto produtoSelecionado = produtos.get(opcao - 1);

                // Verificando se a quantidade está disponível
                if (quantidade <= produtoSelecionado.getQuantidade()) {
                    double total = produtoSelecionado.getPreco() * quantidade;
                    System.out.println("Produto selecionado: " + produtoSelecionado.getNome());
                    System.out.println("Quantidade: " + quantidade);
                    System.out.println("Total a pagar: R$" + total);
                } else {
                    System.out.println("Quantidade indisponivel");
                }
            } else {
                System.out.println("Opção iválida!");
            }

            System.out.println("\nDigite o número do produto desejado (ou 0 para encerrar): ");
            opcao = scanner.nextInt();
        } while (opcao != 0);

        System.out.println("Compra finalizada. Obrigado!");


        /*
        while (opcao != 0) {
            // Validando a opção selecionada pelo usuário
            if (opcao >= 1 && opcao <= produtos.size()) {
                Produto produtoSelecionado = produtos.get(opcao - 1);

                // Verificando se a quantidade está disponível
                if (quantidade <= produtoSelecionado.getQuantidade()) {
                    double total = produtoSelecionado.getPreco() * quantidade;
                    System.out.println("Produto selecionado: " + produtoSelecionado.getNome());
                    System.out.println("Quantidade: " + quantidade);
                    System.out.println("Total a pagar: R$" + total);
                } else {
                    System.out.println("Quantidade indisponivel");
                }
            } else {
                System.out.println("Opção iválida!");
            }

            System.out.println("\nDigite o número do produto desejado (ou 0 para encerrar): ");
            opcao = scanner.nextInt();
        }

        System.out.println("Compra finalizada. Obrigado!");
        */

        /*
        System.out.println("Deseja finalizar a compra? (S/N): ");
        String resposta = scanner.next();

        if (resposta.equalsIgnoreCase("S")){

            System.out.println("Compra finalizada. Obrigado!");
        } else {

            System.out.println("Voltar a compra");
        }
        */

        scanner.close();
    }

}
