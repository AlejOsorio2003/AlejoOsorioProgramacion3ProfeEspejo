package JPA.TP1JPAAvanzada;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Paciente extends BaseEntidad {

    private String nombre;
    private int edad;
    private String obraSocial;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<Consulta> consultas = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    private HistoriaClinica historiaClinica;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Medicamento> medicamentos = new ArrayList<>();

    public Paciente() {}
    public Paciente(String nombre, int edad, String obraSocial) {
        this.nombre = nombre;
        this.edad = edad;
        this.obraSocial = obraSocial;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getObraSocial() { return obraSocial; }
    public List<Consulta> getConsultas() { return consultas; }
    public HistoriaClinica getHistoriaClinica() { return historiaClinica; }
    public List<Medicamento> getMedicamentos() { return medicamentos; }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
}