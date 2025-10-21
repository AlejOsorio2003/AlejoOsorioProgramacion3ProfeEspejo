package JPA.TP1JPAAvanzada;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Medicamento extends BaseEntidad {

    private String nombre;

    @ManyToMany(mappedBy = "medicamentos")
    private List<Paciente> pacientes = new ArrayList<>();

    public Medicamento() {}
    public Medicamento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }
    public List<Paciente> getPacientes() { return pacientes; }
}