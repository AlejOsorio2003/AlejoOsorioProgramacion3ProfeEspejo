package JPA.TP1JPAAvanzada;

import jakarta.persistence.*;

@Entity
public class HistoriaClinica extends BaseEntidad {

    private String descripcion;

    public HistoriaClinica() {}
    public HistoriaClinica(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() { return descripcion; }
}