package mesa24Observer;

import java.util.ArrayList;

public class Leilao implements Observer {

    private float valorInicial;
    private String lote;

    private ArrayList<Observador> observadores = new ArrayList<>();

    public Leilao(float valorInicial, String lote) {
        this.valorInicial = valorInicial;
        this.lote = lote;
    }

    public void atualizarValor(float valor) { //mudar preço
        this.valorInicial = valor;
        notificar("Valor atualizado para " + getValorInicial());

    }

    @Override
    public void adicionar(Observador o) {
        this.observadores.add(o);
    }

    @Override
    public void remover(Observador o) {
        this.observadores.remove(o);
    }

    @Override
    public void notificar(String lance) {
        for(Observador o : observadores) {
            System.out.println(o.atualizar(this) + lance);
        }
    }

    public float getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(float valorInicial) {
        this.valorInicial = valorInicial;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public ArrayList<Observador> getObservadores() {
        return observadores;
    }

    public void setObservadores(ArrayList<Observador> observadores) {
        this.observadores = observadores;
    }
}
