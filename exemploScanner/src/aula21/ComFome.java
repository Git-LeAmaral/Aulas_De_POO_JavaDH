package aula21;

public class ComFome implements Estado {

    Tamagotchi tamagotchi;

    public ComFome(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
        System.out.println("ComFome");
    }

    @Override
    public void comer() {
        tamagotchi.setEstado(new Feliz(tamagotchi));// Assim muda o estado do tamagotchi
    }

    @Override
    public void beber() {
        //sem mudança
    }

    @Override
    public void fazerCarinho() {
        //sem mudança
    }


}
