package gerenciadorDeArquivos;

import java.util.ArrayList;

public class GerenciamentoDeArquivos {

    private ArrayList<Arquivos> listaArquivos = new ArrayList<>();

    public GerenciamentoDeArquivos() {}

    public void exibirArquivos() {
        for (Arquivos arquivo : listaArquivos) {
            System.out.println("Nome do Arquivo: " + arquivo.getNome() + " tamanho: " + arquivo.calcularTamanhoArquivo());
        }
    }

    public void adicionarArquivo(Arquivos arquivo) {
        listaArquivos.add(arquivo);
    }

    public double calcularTamanhoArquivo() {
        double tamanhoTotal = 0;
        for (Arquivos arquivo : listaArquivos) {
            tamanhoTotal += arquivo.calcularTamanhoArquivo();
        }
        return tamanhoTotal;
    }

    public ArrayList<Arquivos> getListaArquivos() {
        return listaArquivos;
    }

    public void setListaArquivos(ArrayList<Arquivos> listaArquivos) {
        this.listaArquivos = listaArquivos;
    }
}
