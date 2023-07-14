package gerenciadorDeArquivos;

public class ArquivosConcretos extends Arquivos {

    private double tamanhoArquivo;

    public ArquivosConcretos(String nome, double tamanhoArquivo) {
        super(nome);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public double calcularTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

}
