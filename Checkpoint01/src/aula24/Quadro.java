package aula24;

import java.util.ArrayList;

public class Quadro implements Observer {

    private ArrayList<Observador> observadores = new ArrayList<>();

    private float precoAtual;

    @Override
    public void adicionar(Observador o) {
        this.observadores.add(o);
    }

    @Override
    public void remover(Observador o) {
        this.observadores.remove(o);
    }

    @Override
    public void notificar(String cambio) {

        for (Observador o: observadores) {
            System.out.println(o.atualizar() + cambio);
        }
    }

    public float obterPreco() {
        return precoAtual;
    }

    public void mudarPreco(float preco) {
        this.precoAtual = preco;
        notificar(" preço atualizado para " + obterPreco());
    }
}
