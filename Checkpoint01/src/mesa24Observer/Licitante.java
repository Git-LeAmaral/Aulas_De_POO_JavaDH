package mesa24Observer;

public class Licitante implements Observador {

    private String nome;
    private int numeroParticipante;
    private float valorOferta;

    public Licitante(String nome, int numeroParticipante, float valorOferta) {
        this.nome = nome;
        this.numeroParticipante = numeroParticipante;
        this.valorOferta = valorOferta;
    }

    @Override
    public String atualizar(Leilao leilao) {

        if (leilao.getValorInicial() < valorOferta) {
            System.out.println(getNome() + " " + getNumeroParticipante() + " esta pagando " + valorOferta);
        } else {
            System.out.println("Quem da mais!!!");
        }

        return "Valor atual: ";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroParticipante() {
        return numeroParticipante;
    }

    public void setNumeroParticipante(int numeroParticipante) {
        this.numeroParticipante = numeroParticipante;
    }

    public float getValorOferta() {
        return valorOferta;
    }

    public void setValorOferta(float valorOferta) {
        this.valorOferta = valorOferta;
    }

}
