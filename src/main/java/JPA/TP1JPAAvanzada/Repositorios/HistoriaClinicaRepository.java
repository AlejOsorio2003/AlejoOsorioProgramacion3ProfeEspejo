package JPA.TP1JPAAvanzada.Repositorios;

import JPA.TP1JPAAvanzada.HistoriaClinica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoriaClinicaRepository extends JpaRepository<HistoriaClinica, Long> {
}