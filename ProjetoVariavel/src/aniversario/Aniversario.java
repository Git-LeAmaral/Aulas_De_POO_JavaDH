package aniversario;

import java.util.Scanner;

public class Aniversario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeUsuario = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite o dia de nascimento: ");
        int diaNascimento = scanner.nextInt();

        System.out.println("Digite o mês de nascimento: ");
        int mesNascimento = scanner.nextInt();

        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        String iniciais = nomeUsuario.substring(0,1) + sobrenome.substring(0,1);

        System.out.println("Feliz aniversario " + nomeUsuario + " você nasceu no dia " + diaNascimento + " / "
                + mesNascimento + " / " + anoNascimento);

        System.out.println(iniciais);



    }
}
