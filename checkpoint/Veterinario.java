package checkpoint;

public class Veterinario extends Funcionario{

    private String especialidade;

    public Veterinario(String nome, String telefone, String cpf, double salario, int horaTrabalho, String especialidade) {
        super(nome, telefone, cpf, salario, horaTrabalho);
        this.especialidade = especialidade;
    }


    public String receberConsulta(){

        return null;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
