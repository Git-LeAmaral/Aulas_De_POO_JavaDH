package gerenciadorDeArquivos;

import java.util.ArrayList;

public class Pasta extends Arquivos {

    private ArrayList<Arquivos> listaArquivos = new ArrayList<>();

    public Pasta(String nome) {
        super(nome);
    }

    public void inserirArquivos(Arquivos arquivo) {
        listaArquivos.add(arquivo);
    }

    @Override
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
