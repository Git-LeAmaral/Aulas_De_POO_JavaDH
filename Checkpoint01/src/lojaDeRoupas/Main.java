package lojaDeRoupas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Sacola sacola = new Sacola();
        List<Produto> produtos = new ArrayList<>();

        Cliente Andrea = new Cliente("Andrea Silva", "Rua Antonio Volpe, São Paulo, 17", "(11)91120544", "andrea@gmail.com");
        Cliente Leandro = new Cliente("Leandro Amaral", "Rua Dr. Manoel Afonso, Campinas, 98", "(19)991663254", "leandro@gmail.com");
        Cliente Luiz = new Cliente("Luiz Augusto", "Rua José Machado, Centro São Paulo", "(11)96635487", "luiz@gmail.com");

        produtos.add(new Produto("Camiseta Branca", 12.99, 5));
        produtos.add(new Produto("Calça Jeans", 49.99, 8));
        produtos.add(new Produto("Vestido Longo", 16.59, 3));

        // Exibindo a lista de produtos ao usuário
        System.out.println("Lista de Produtos: ");
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            System.out.println((i + 1) + ". " + produto.getTipo() + " -R$ " + produto.getPreco() + " Quantidade: " + produto.getQuantidade());
        }

        boolean continuar = true;

        while (continuar) {

            // Solicitando a opção e quantidade ao usuário
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o número do produto desejado: ");
            int opcao = scanner.nextInt();

            System.out.print("Digite a quantidade desejada: ");
            int quantidade = scanner.nextInt();

            System.out.println("Deseja continuar comprando? (S/N):");
            String resposta = scanner.next();

            if(resposta.equalsIgnoreCase("N")) {
                continuar = false;
            }

            if (opcao == 1) {
                sacola.adicionar(produtos.get(0));
                produtos.get(0).atualizarQuantidade(quantidade);
            } else if (opcao == 2) {
                sacola.adicionar(produtos.get(1));
                produtos.get(1).atualizarQuantidade(quantidade);
            } else if (opcao == 3) {
                sacola.adicionar(produtos.get(2));
                produtos.get(2).atualizarQuantidade(quantidade);
            } else {
                System.out.println("Essa opção não existe!");
                break;
            }
            System.out.println("Produtos na sacola de compras:");

            for(Produto sacola1 : sacola.getListaSacola()) {
                System.out.println(sacola1.getTipo() + " e " + sacola1.getPreco());
            }
        }

        }

    }
