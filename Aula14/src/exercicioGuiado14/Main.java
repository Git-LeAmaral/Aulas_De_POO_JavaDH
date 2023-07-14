package exercicioGuiado14;

public class Main {

    public static void main(String[] args) {

        Equipe equipe = new Equipe("Galacticos");

        Jogador jogador1 = new Jogador(3, "Leandro", true, true);
        Jogador jogador2 = new Jogador(1, "Robson", false, true);
        Jogador jogador3 = new Jogador(5, "Gabriel", false, false);
        Jogador jogador4 = new Jogador(8, "Messi", true, true);
        Jogador jogador5 = new Jogador(10, "Renato Augusto", false, true);

        equipe.adicionarJogador(jogador1);
        equipe.adicionarJogador(jogador2);
        equipe.adicionarJogador(jogador3);
        equipe.adicionarJogador(jogador4);
        equipe.adicionarJogador(jogador5);

        equipe.mostarJogadoresTitulares();
        System.out.println("Quantidade de jogadores lesionados: " + equipe.getQuantidadeJogadoresLesionados());

        jogador2.compareTo(jogador5);
        jogador3.compareTo(jogador1);

    }
}
