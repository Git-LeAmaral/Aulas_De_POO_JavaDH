package lojaDeRoupas;

import java.util.ArrayList;

public class Sacola {

    private EstadoSacola estadoSacola;
    private ArrayList<Produto> listaSacola = new ArrayList<>();

    public void mostrarProduto() {
        for(Produto produto: listaSacola) {
            System.out.println(produto.getTipo() + produto.getPreco());
        }
    }

    public Sacola() {
        this.setEstadoSacola(new Vazio(this));
    }

    public void adicionar(Produto produto) {
        getEstadoSacola().adicionar(produto);
        listaSacola.add(produto);
    };
    public void cancelar() {

    };
    public void retornar() {

    };
    public void avancar() {

    };

    public EstadoSacola getEstadoSacola() {
        return estadoSacola;
    }

    public void setEstadoSacola(EstadoSacola estadoSacola) {
        this.estadoSacola = estadoSacola;
    }

    public ArrayList<Produto> getListaSacola() {
        return listaSacola;
    }

    public void setListaSacola(ArrayList<Produto> listaSacola) {
        this.listaSacola = listaSacola;
    }
}
