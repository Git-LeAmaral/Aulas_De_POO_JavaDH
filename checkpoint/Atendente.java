package checkpoint;

public class Atendente extends Funcionario{

    private String turno;

    public Atendente(String nome, String telefone, String cpf, double salario, int horaTrabalho, String turno) {
        super(nome, telefone, cpf, salario, horaTrabalho);
        this.turno = turno;
    }


    public String getTurno() {
        return turno;
    }

   public void setTurno(String turno) {
        this.turno = turno;
    }
}


