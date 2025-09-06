package ToStringEqualYHascode.TP3ToString;

import ToStringEqualYHascode.TP1ToString.Estudiante;

import java.util.List;

public class Curso {
    private String nombre;
    private String profesor;
    private List<Estudiante> listaDeEstudiantes;

    public Curso(String nombre, String profesor, List<Estudiante> listaDeEstudiantes) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.listaDeEstudiantes = listaDeEstudiantes;
    }

    @Override
    public String toString() {
        return
                "nombre: " + nombre + '\n' +
                "profesor: " + profesor + '\n' +
                "listaDeEstudiantes: " + listaDeEstudiantes;
    }
}
