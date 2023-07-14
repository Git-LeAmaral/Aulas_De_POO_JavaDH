package aula03;

import java.time.LocalDate;

public class Pessoa {

        private String nome;
        private float altura;
        private Double peso;
        private LocalDate dataNascimento;
        private byte idade;
        private String nacionalidade;

    // Construtor: informa OBRIGATÓRIAMENTE como um objeto deve ser criado
    public Pessoa(String nome, LocalDate dataNascimento) {

            this.nome = nome;
            this.dataNascimento = dataNascimento;

        }

    public Pessoa(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    //Exemplo sem retorno

    public void andar(Double distancia) {
        if(distancia <= 10) {
            System.out.println("PODEMOS IR ANDANDO");
        } else {
            System.out.println("MUITO LONGE. VÁ DE CARRO");
        }
    }


    //EXEMPLO COM RETORNO
    public Double dormir() {

        return 12.0;
    }

    public Double dormir1() {
        double horaAcordar = 12D;
        return horaAcordar;
    }
}


