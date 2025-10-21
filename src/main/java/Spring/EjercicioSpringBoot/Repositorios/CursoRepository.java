package Spring.EjercicioSpringBoot.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import Spring.EjercicioSpringBoot.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {}