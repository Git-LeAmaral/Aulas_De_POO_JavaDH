package aula24;

public class Main {

    public static void main(String[] args) {

        Quadro quadro = new Quadro();
        Ouro ouro1 = new Ouro();
        Observador ouro2 = new Ouro(); //Exemplo de polimorfismo

        quadro.adicionar(ouro1);
        quadro.adicionar(ouro2);

        quadro.mudarPreco(297F);
        System.out.println("Preço atual do quadro: " + quadro.obterPreco());
        quadro.mudarPreco(300F);
        System.out.println("Preço atual do quadro: " + quadro.obterPreco());
    }

}
