package Spring.EjercicioSpringBoot.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import Spring.EjercicioSpringBoot.Entidades.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {}