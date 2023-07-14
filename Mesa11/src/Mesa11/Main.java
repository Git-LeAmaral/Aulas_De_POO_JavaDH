package aula11;

public class Main {

    public static void main(String[] args) {


        Cavalo Zeus = new Cavalo("Zeus", 5);
        System.out.println(Zeus.tipoDeSom());
        System.out.println(Zeus.correr());

        Cachorro Pandora = new Cachorro("Pandora", 3);
        System.out.println(Pandora.tipoDeSom());
        System.out.println(Pandora.correr());

        Preguica Sonolenta = new Preguica("Sonolenta", 9);
        System.out.println(Sonolenta.tipoDeSom());
        System.out.println(Sonolenta.SubirEmArvore());
    }
}
