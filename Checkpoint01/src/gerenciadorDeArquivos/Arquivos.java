package gerenciadorDeArquivos;

public abstract class Arquivos {

    private String nome;

    public Arquivos(String nome) {
        this.nome = nome;
    }

    public abstract double calcularTamanhoArquivo();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
