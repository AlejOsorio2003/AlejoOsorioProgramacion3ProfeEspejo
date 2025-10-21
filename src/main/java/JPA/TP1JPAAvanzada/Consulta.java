package JPA.TP1JPAAvanzada;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Consulta extends BaseEntidad {

    private LocalDate fecha;
    private String diagnostico;

    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private Medico medico;

    public Consulta() {}
    public Consulta(LocalDate fecha, String diagnostico, Paciente paciente, Medico medico) {
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.paciente = paciente;
        this.medico = medico;
    }

    public LocalDate getFecha() { return fecha; }
    public String getDiagnostico() { return diagnostico; }
    public Paciente getPaciente() { return paciente; }
    public Medico getMedico() { return medico; }
}