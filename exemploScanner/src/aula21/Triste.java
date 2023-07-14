package aula21;

public class Triste implements Estado {

    Tamagotchi tamagotchi;

    public Triste(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
        System.out.println("Triste");
    }


    @Override
    public void comer() {
        System.out.println("Beep, beep, Tamagotchi Vomitando");
    }

    @Override
    public void beber() {
        System.out.println("");
    }

    @Override
    public void fazerCarinho() {

    }
}
