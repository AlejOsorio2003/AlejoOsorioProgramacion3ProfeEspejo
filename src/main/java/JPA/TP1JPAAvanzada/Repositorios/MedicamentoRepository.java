package JPA.TP1JPAAvanzada.Repositorios;

import JPA.TP1JPAAvanzada.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {
}