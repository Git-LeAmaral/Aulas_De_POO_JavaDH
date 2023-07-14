package listaProdutosDoWhile;

import java.util.Scanner;

public class ListaProdutosDoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] produtos = {"Camiseta", "Calça", "Vestido"};
        double[] precos = {12.99, 35.5, 29.90};
        int[] estoque = {5, 3, 2};

        System.out.println("Bem-Vindo(a) á nossa loja!");

        do {
            System.out.println("\nOpções de compra:");
            for (int i = 0; i < produtos.length; i++) {
                System.out.println((i + 1) + ". " + produtos[i] + " -R$" + precos[i] + " Estoque: " + estoque[i]);
            }
            System.out.println("0. Finalizar Compra");

            int opcao;
            int quantidade;

            do {
                System.out.print("\nEscolha uma opção: ");
                opcao = scanner.nextInt();

                if (opcao < 0 || opcao > produtos.length) {
                    System.out.println("Opção inválida! Por favor, escolha uma opção valida.");
                }
            } while (opcao < 0 || opcao > produtos.length);

            if (opcao == 0) {
                System.out.println("\nCompra finalizada. Obrigado!");
                break;
            }

            do {
                System.out.print("Digite a quantidade desejada: ");
                quantidade = scanner.nextInt();

                if (quantidade < 0 || quantidade > estoque[opcao - 1]) {
                    System.out.println("Quantidade inválida! Por favor, digite uma quantidade válida.");
                }
            } while (quantidade < 0 || quantidade > estoque[opcao - 1]);

            // Fazer o processamento da compra
            System.out.println("\nVocê selecionou: " + produtos[opcao - 1]);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Total a pagar: R$" + (precos[opcao -1] * quantidade));

            // Atualizar o estoque
            estoque[opcao -1] -= quantidade;

        } while (true);

    }
}
