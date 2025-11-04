package Spring.EjercicioSpringBoot.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import Spring.EjercicioSpringBoot.Entidades.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {}