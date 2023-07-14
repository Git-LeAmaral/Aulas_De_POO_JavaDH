package produtosSacola;

import java.util.ArrayList;
import java.util.List;

public class SacolaDeCompras {

    private List<ProdutoSa> produtos;

    public SacolaDeCompras() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(ProdutoSa produto) {
        produtos.add(produto);
    }
}
