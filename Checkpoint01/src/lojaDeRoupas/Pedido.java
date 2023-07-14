package lojaDeRoupas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {

    private int numeroPedido;
    private String nomeCliente;
    private ArrayList<Produto> produtos;
    private LocalDate dataCompra;

    public Pedido(int numeroPedido, String nomeCliente, LocalDate dataCompra) {
        this.numeroPedido = numeroPedido;
        this.nomeCliente = nomeCliente;
        this.produtos = new ArrayList<>();
        this.dataCompra = dataCompra;
    }

    public void adicionarItem(Produto produto){

        produtos.add(produto);
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

}
