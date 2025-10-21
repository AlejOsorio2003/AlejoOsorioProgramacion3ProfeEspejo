package JPA.TP1JPAAvanzada.Repositorios;

import JPA.TP1JPAAvanzada.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    List<Paciente> findByEdadGreaterThan(int edad);
    List<Paciente> findByObraSocial(String obraSocial);
    Paciente findByNombre(String nombre);
}