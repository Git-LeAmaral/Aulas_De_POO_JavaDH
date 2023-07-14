package aula22;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Item> listaItem = new ArrayList<>();

    public Carrinho() { }

    public void mostrarItem() {
        for (Item item : listaItem) {
            System.out.println("nome: " + item.getNome() + "Valor de R$ " + item.calcularPreco());
        }
    }

    public void addItem(Item item) {
        listaItem.add(item);
    }

    public double valorTotal() {
        double valorTotal = 0;
        for (Item item : listaItem) {
            valorTotal += item.calcularPreco();
        }
        return valorTotal;
    }
}
