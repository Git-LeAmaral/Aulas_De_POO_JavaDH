package gerenciadorDeArquivos;

public class Main {

    public static void main(String[] args) {

        GerenciamentoDeArquivos sistema1 = new GerenciamentoDeArquivos();
        Arquivos arquivo1 = new ArquivosConcretos("Aula de Java.mp4", 230.5);
        Arquivos arquivo2 = new ArquivosConcretos("Aula2 de Java.mp4", 120.4);
        Arquivos arquivo3 = new ArquivosConcretos("Aula3 de Java.mp4", 300.0);
        Arquivos arquivo4 = new ArquivosConcretos("Aula4 de Java.mp4", 100.0);

        Arquivos pastaJava = new Pasta("Aulas de Programação Orientada Objetos");

        ((Pasta)pastaJava).inserirArquivos(arquivo1);
        ((Pasta)pastaJava).inserirArquivos(arquivo2);

        sistema1.adicionarArquivo(pastaJava);
        sistema1.adicionarArquivo(arquivo3);

        sistema1.exibirArquivos();
        System.out.println("Tamanho dos arquivos: " + sistema1.calcularTamanhoArquivo());
    }
}
