package Aula11;

public class Cachorro extends Animal{

    public Cachorro(String nome, Integer idade) {
        super (nome, idade);
    }

    @Override
    public String tipoDeSom() {
        return "AuAUAUAU!!!!!";
    }

    public String correr() {
        return this.getNome() + "Esta correndo....";
    };
}
