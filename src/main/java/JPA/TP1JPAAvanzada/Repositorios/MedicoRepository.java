package JPA.TP1JPAAvanzada.Repositorios;

import JPA.TP1JPAAvanzada.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    Medico findByNombre(String nombre);
}