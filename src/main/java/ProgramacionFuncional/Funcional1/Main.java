package ProgramacionFuncional.Funcional1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
                new Alumno("Ana", 8.5, "Java"),
                new Alumno("Luis", 6.0, "Python"),
                new Alumno("Marta", 9.0, "Java"),
                new Alumno("Carlos", 7.0, "Python"),
                new Alumno("Sofía", 5.5, "Java"),
                new Alumno("Tomás", 10.0, "Python")
        );

        List<String> aprobados = alumnos.stream()
                .filter(a -> a.getNota() >= 7)
                .map(a -> a.getNombre().toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Aprobados:");
        aprobados.forEach(System.out::println);

        double promedio = alumnos.stream()
                .mapToDouble(Alumno::getNota)
                .average()
                .orElse(0.0);

        System.out.println("Promedio general: " + promedio);

        Map<String, List<Alumno>> agrupados = alumnos.stream()
                .collect(Collectors.groupingBy(Alumno::getCurso));

        System.out.println("Alumnos agrupados por curso:");
        agrupados.forEach((curso, lista) -> {
            System.out.println("Curso: " + curso);
            lista.forEach(System.out::println);
        });

        List<Alumno> top3 = alumnos.stream()
                .sorted(Comparator.comparingDouble(Alumno::getNota).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Top 3 mejores promedios:");
        top3.forEach(System.out::println);
    }
}
