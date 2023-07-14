package exercicioGuiado14;

public class Jogador implements Comparable<Jogador> {

    private int numeroCamisa;
    private String nome;
    private boolean lesionado;
    private boolean titular;

    public Jogador(int numeroCamisa, String nome, boolean lesionado, boolean titular) {
        this.numeroCamisa = numeroCamisa;
        this.nome = nome;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    @Override
    public int compareTo(Jogador o) {

        if(this.numeroCamisa ==  o.numeroCamisa) {

            System.out.println("O número da camisa " + this.numeroCamisa + " é igual ao da camisa " + o.numeroCamisa);
            return 0; // Se iguais retorna 0

        } else if(this.numeroCamisa < o.numeroCamisa) {
            System.out.println("O número da camisa " + this.numeroCamisa + " é menor que a camisa " + o.numeroCamisa);
            return -1; // Se this.numeroCamisa < o.numeroCamisa retorna um numero menor que 0
        } else{
            System.out.println("O número da camisa " + this.numeroCamisa + " é maior que a camisa " + o.numeroCamisa);
            return 1; // Se this.numeroCamisa > o.numeroCamisa retorna um numero maior que 0
        }
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }
}
