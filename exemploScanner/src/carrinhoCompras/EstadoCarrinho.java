package carrinhoCompras;

public interface EstadoCarrinho {

    public void adicionar(Produto produto);
    public void cancelar();
    public void retornar();
    public void avancar();
}
