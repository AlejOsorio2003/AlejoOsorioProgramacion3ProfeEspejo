package JPA.TP1JPAAvanzada;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fechaCreacion = LocalDateTime.now();

    public Long getId() { return id; }
    public LocalDateTime getFechaCreacion() { return fechaCreacion; }
}