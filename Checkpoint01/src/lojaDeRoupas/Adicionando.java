package lojaDeRoupas;

public class Adicionando implements EstadoSacola {

    Sacola sacola;

    public Adicionando(Sacola sacola) {
        this.sacola = sacola;
        System.out.println("Adicionando");
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
        sacola.setEstadoSacola(new Vazio(sacola));
    }

    @Override
    public void avancar() {
        sacola.setEstadoSacola(new Pagando(sacola));
    }
}
