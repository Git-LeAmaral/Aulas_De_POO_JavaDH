package lojaDeRoupas;

public class Finalizado implements EstadoSacola {

    Sacola sacola;

    public Finalizado(Sacola sacola) {
        this.sacola = sacola;
        System.out.println("Finalizado");
    }

    @Override
    public void adicionar(Produto produto) {
        // não muda
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
        sacola.setEstadoSacola(new Vazio(sacola));
    }
}
