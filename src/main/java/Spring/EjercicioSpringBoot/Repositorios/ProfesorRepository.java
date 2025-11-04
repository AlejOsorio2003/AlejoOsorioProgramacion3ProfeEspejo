package Spring.EjercicioSpringBoot.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import Spring.EjercicioSpringBoot.Entidades.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {}