package JPA.TP1JPAAvanzada.Repositorios;

import JPA.TP1JPAAvanzada.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    List<Consulta> findByMedicoNombre(String nombre);
}