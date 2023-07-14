package lojaDeRoupas;

public class Vazio implements EstadoSacola {

    Sacola sacola;

    public Vazio(Sacola sacola) {
        this.sacola = sacola;
        System.out.println("Vazio");
    }

    @Override
    public void adicionar(Produto produto) {
        sacola.setEstadoSacola(new Adicionando(sacola));
    }

    @Override
    public void cancelar() {
        // não muda
    }

    @Override
    public void retornar() {
        // não muda
    }

    @Override
    public void avancar() {
        // não muda
    }
}
