package aula21;

public class ComSede implements Estado{

    Tamagotchi tamagotchi;

    public ComSede(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
        System.out.println("ComSede");
    }

    @Override
    public void comer() {
        //sem mudança
    }

    @Override
    public void beber() {
        tamagotchi.setEstado(new Feliz(tamagotchi));
    }

    @Override
    public void fazerCarinho() {
        //sem mudança
    }
}
