package aula11;

public class Preguica extends Animal{

    public Preguica(String nome, Integer idade) {
        super (nome, idade);
    }

    @Override
    public String tipoDeSom() {
        return "huuuuuuummmmm!!!!!";
    }

    public String SubirEmArvore() {
        return this.getNome() + " Esta escalando a árvore....";
    };
}