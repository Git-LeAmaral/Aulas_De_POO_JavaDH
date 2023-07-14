package aula05Playground;

public class Main {

    public static void main(String[] args) {

        Artigo artigo = new Artigo("Artigo 1", 1000, 100);

        System.out.println("Preço: " + artigo.consultarPreco());
    }
}
