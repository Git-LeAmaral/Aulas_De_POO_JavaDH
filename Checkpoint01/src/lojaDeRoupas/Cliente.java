package lojaDeRoupas;

public class Cliente {

    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    //constructor
    public Cliente(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    //methods
    public void realizarCompra() {
        System.out.println("Compra Efetuada");
    }

    public void modificarCadastro(String nome, String endereco, String telefone) {

        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    //get e set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
