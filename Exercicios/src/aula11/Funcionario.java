public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }



    public double addAumento(double valor){

        return valor;
    }

    public double ganhoAnual(){

        return 0;
    }

    public void exibeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário é: " + salario);
    }





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
