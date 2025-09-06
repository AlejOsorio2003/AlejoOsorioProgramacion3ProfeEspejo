package ToStringEqualYHascode.TP1ToString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();

        Estudiante estudiante1 = new Estudiante("Juan", 20, "Ingeniería en sistemas");
        Estudiante estudiante2 = new Estudiante("Maria", 22, "Diseño Gráfico");
        Estudiante estudiante3 = new Estudiante("Pedro", 21, "Medicina");

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);

        System.out.println(estudiantes);
    }
}