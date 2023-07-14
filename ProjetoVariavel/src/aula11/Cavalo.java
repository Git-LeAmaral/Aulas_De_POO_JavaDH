package aula11;

public class Cavalo extends Animal {

    public Cavalo(String nome, Integer idade) {

        super (nome, idade);
    }

    @Override
    public String tipoDeSom() {
        return "IIIhiiiii ";
    };

    public String correr() {
        return this.getNome() + " Esta correndo....";
    };

}
