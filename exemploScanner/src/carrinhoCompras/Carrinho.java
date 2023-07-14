package carrinhoCompras;

import aula21.ComFome;

import java.util.ArrayList;

public class Carrinho {

    private EstadoCarrinho estadoCarrinho;
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public void mostrarProduto() {
        for(Produto produto: listaProdutos) {
            System.out.printf(produto.getDescricao() + " ");
        }
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public Carrinho() {
        this.setEstadoCarrinho(new Vazio(this));
    }

    public void adicionar(Produto produto) {
        getEstadoCarrinho().adicionar(produto);
        listaProdutos.add(produto);
    }

    public void cancelar() {
        getEstadoCarrinho().cancelar();
        listaProdutos.clear();
    }

    public void retornar() {
        getEstadoCarrinho().retornar();
    }

    public void avancar() {
        getEstadoCarrinho().avancar();
    }

    public EstadoCarrinho getEstadoCarrinho() {
        return estadoCarrinho;
    }

    public void setEstadoCarrinho(EstadoCarrinho estadoCarrinho) {
        this.estadoCarrinho = estadoCarrinho;
    }
}

