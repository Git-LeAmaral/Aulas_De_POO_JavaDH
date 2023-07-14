package entradaDeDados;

import java.util.Scanner;

public class EntradaScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Funcionario:");
        String nomeDoFuncionario = scanner.next();

        System.out.println("O nome do Funcionario é: " + nomeDoFuncionario);

        System.out.println("Digite o salario do Funcionario:");
        double salario = scanner.nextDouble();

        System.out.println("O salario do Funcionario é: " + salario);
    }
}
