package Spring.EjercicioSpringBoot.Controladores;

import Spring.EjercicioSpringBoot.*;
import Spring.EjercicioSpringBoot.Repositorios.*;
import Spring.EjercicioSpringBoot.CursoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired private CursoRepository cursoRepo;
    @Autowired private ProfesorRepository profesorRepo;
    @Autowired private EstudianteRepository estudianteRepo;

    @GetMapping
    public List<Curso> listarCursos() {
        return cursoRepo.findAll();
    }

    @PostMapping("/nuevo")
    public Curso crearCurso(@RequestBody CursoDTO dto) {
        Profesor profe = profesorRepo.findById(dto.profesorId()).orElse(null);
        Curso curso = new Curso();
        curso.setNombre(dto.nombre());
        curso.setProfesor(profe);
        return cursoRepo.save(curso);
    }

    @PostMapping("/{cursoId}/asignar-estudiante/{estudianteId}")
    public Curso asignarEstudiante(@PathVariable Long cursoId, @PathVariable Long estudianteId) {
        Curso curso = cursoRepo.findById(cursoId).orElseThrow();
        Estudiante est = estudianteRepo.findById(estudianteId).orElseThrow();
        curso.getEstudiantes().add(est);
        return cursoRepo.save(curso);
    }

    @GetMapping("/por-estudiante/{estudianteId}")
    public List<Curso> cursosPorEstudiante(@PathVariable Long estudianteId) {
        Estudiante est = estudianteRepo.findById(estudianteId).orElseThrow();
        return est.getCursos();
    }
}