package lojaDeRoupas;

public class Pagando implements EstadoSacola {

    Sacola sacola;

    public Pagando(Sacola sacola) {
        this.sacola = sacola;
        System.out.println("Pagando");
    }

    @Override
    public void adicionar(Produto produto) {
        // não muda
    }

    @Override
    public void cancelar() {
        sacola.setEstadoSacola(new Vazio(sacola));
    }

    @Override
    public void retornar() {
        // não muda
    }

    @Override
    public void avancar() {
        sacola.setEstadoSacola(new Finalizado(sacola));
    }
}
