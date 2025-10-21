package Spring.EjercicioSpringBoot.Controladores;

import Spring.EjercicioSpringBoot.Profesor;
import Spring.EjercicioSpringBoot.Repositorios.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesores")
public class ProfesorController {

    @Autowired private ProfesorRepository repo;

    @GetMapping
    public List<Profesor> listar() {
        return repo.findAll();
    }
}