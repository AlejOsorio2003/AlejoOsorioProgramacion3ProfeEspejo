package ToStringEqualYHascode.TP3ToString;

import ToStringEqualYHascode.TP1ToString.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan", 20, "Ingeniería en sistemas");
        Estudiante estudiante2 = new Estudiante("Maria", 22, "Diseño Gráfico");
        Estudiante estudiante3 = new Estudiante("Pedro", 21, "Medicina");

        List<Estudiante> listaEstudiantes1 = new ArrayList<Estudiante>();
        listaEstudiantes1.add(estudiante1);
        listaEstudiantes1.add(estudiante2);

        List<Estudiante> listaEstudiantes2 = new ArrayList<Estudiante>();
        listaEstudiantes2.add(estudiante3);

        Curso c1 = new Curso("Programación", "Prof. Giuliano Espejo", listaEstudiantes1);
        Curso c2 = new Curso("Metodología", "Prof. Marcos Riveros", listaEstudiantes2);

        System.out.println("Curso 1: "+c1);
        System.out.println("\nCurso 2: "+c2);
    }
}
