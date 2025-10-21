package Spring.EjercicioSpringBoot.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import Spring.EjercicioSpringBoot.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {}