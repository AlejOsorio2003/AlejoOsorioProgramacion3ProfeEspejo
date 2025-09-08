package Colecciones.TP4Colecciones;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Curso> cursos = new HashMap();

        Curso curso1 = new Curso("Java", "Espejo");
        Curso curso2 = new Curso("HTML y CSS", "Chiroli");
        Curso curso3 = new Curso("MongoDB", "Gonzales");

        cursos.put(123, curso1);
        cursos.put(234, curso2);
        cursos.put(345, curso3);

        System.out.println("Curso con codigo 123: "+cursos.get(123));

        for (Map.Entry<Integer, Curso> e: cursos.entrySet()){
            System.out.println(e.getKey());
        }
    }
}
