package mesa24Observer;

public class Main {

    public static void main(String[] args) {

        Leilao leilao = new Leilao(150F, "Motos");

        Licitante participante1 = new Licitante("Leandro", 5, 180F);
        Licitante participante2 = new Licitante("Poliana", 11, 200F);

        leilao.adicionar(participante1);
        leilao.adicionar(participante2);

        System.out.println(leilao.getValorInicial());
        leilao.atualizarValor(90F);
    }
}
