package aula21;

public class Feliz implements Estado {

    //Sempre declarar os atributos para os construtores
    Tamagotchi tamagotchi;

    public Feliz(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
        System.out.println("Feliz");
    }

    @Override
    public void comer() {
        //sem mudança
    }

    @Override
    public void beber() {
        System.out.println("beep, beep, beep, beep, beep");
    }

    @Override
    public void fazerCarinho() {
        //sem mudança
    }
}
