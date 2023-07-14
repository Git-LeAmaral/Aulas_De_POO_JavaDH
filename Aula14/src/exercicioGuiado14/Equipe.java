package exercicioGuiado14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Equipe {

    private String nome;

    private ArrayList<Jogador> listaJogadores = new ArrayList<>();

    public Equipe(String nome) {
        this.nome = nome;
    }

    // Metodo para alimentar a lista de jogadores

    public void adicionarJogador(Jogador jogador) {

        listaJogadores.add(jogador);
    }

    public void mostarJogadoresTitulares() {

        Collections.sort(listaJogadores); // ordena a list em ordem crescente, descrescente seria .reverseorder()

        //Para cada jogador da listaJogadores ele adicona na variavel jogador
        for (Jogador jogador: listaJogadores) {
            if(jogador.isTitular()) {
                System.out.println("Nome: " + jogador.getNome() + " Número da camisa: " + jogador.getNumeroCamisa());
            }
        }
    }

    public int getQuantidadeJogadoresLesionados() {

        int contador = 0;

        for (Jogador jogador: listaJogadores) {
            if(jogador.isLesionado() && jogador.isTitular()) {
                contador++;
            }
        }
        return contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Jogador> getListaJogadores() {
        return listaJogadores;
    }

    public void setListaJogadores(ArrayList<Jogador> listaJogadores) {
        this.listaJogadores = listaJogadores;
    }
}
