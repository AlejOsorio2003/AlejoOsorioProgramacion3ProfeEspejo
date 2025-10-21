package JPA.TP1JPAAvanzada;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Medico extends BaseEntidad {

    private String nombre;
    private String especialidad;

    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Consulta> consultas = new ArrayList<>();

    public Medico() {}
    public Medico(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public List<Consulta> getConsultas() { return consultas; }
}