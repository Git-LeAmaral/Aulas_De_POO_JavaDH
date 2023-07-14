package checkpoint;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Consulta {

    private LocalDate dataConsulta;
    private LocalTime horaConsulta;
    private Double valorTotal;
    private String diagnostico;
    private Veterinario veterinario;
    private Dono dono;


    public Consulta(LocalDate dataConsulta, LocalTime horaConsulta, Double valorTotal,
                    String diagnostico, Veterinario veterinario, Dono dono) {
        this.dataConsulta = dataConsulta;
        this.horaConsulta = horaConsulta;
        this.valorTotal = valorTotal;
        this.diagnostico = diagnostico;
        this.veterinario = veterinario;
        this.dono = dono;
    }

    public Double adicionarDespesa(Double valor) {
        this.valorTotal = this.valorTotal + valor;
        return this.valorTotal;
    }

public LocalDateTime marcaConsulta(LocalDate dataConsulta, LocalTime horaConsulta, Veterinario veterinario, Dono dono) {
        this.dataConsulta = dataConsulta;
        this.horaConsulta = horaConsulta;
        this.veterinario = veterinario;
        this.dono = dono;

        return this.dataConsulta.atTime(this.horaConsulta);
}

public void cancelarConsultar(LocalDate dataConsulta, LocalTime horaConsulta){

    this.dataConsulta = null;
    this.horaConsulta = null;
}

public String atualizarDiagnostico(String diagnostico){

    this.diagnostico = diagnostico;

    return diagnostico;
}

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public LocalTime getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(LocalTime horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }
}
