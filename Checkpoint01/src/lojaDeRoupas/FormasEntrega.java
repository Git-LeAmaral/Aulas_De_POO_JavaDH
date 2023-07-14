package lojaDeRoupas;

public class FormasEntrega {

    private String correios;
    private String retiradaLoja;

    public FormasEntrega(String correios, String retiradaLoja) {
        this.correios = correios;
        this.retiradaLoja = retiradaLoja;
    }

    public void tipoEnvio() {

        System.out.println("Produto enviado com sucssso");
    }

    public String getCorreios() {
        return correios;
    }

    public void setCorreios(String correios) {
        this.correios = correios;
    }

    public String getRetiradaLoja() {
        return retiradaLoja;
    }

    public void setRetiradaLoja(String retiradaLoja) {
        this.retiradaLoja = retiradaLoja;
    }
}
