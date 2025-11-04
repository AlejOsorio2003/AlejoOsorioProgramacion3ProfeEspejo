package Spring.EjercicioSpringBoot.Controladores;

import Spring.EjercicioSpringBoot.Entidades.Estudiante;
import Spring.EjercicioSpringBoot.Repositorios.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired private EstudianteRepository repo;

    @GetMapping
    public List<Estudiante> listar() {
        return repo.findAll();
    }
}