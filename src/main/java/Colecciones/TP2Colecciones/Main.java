package Colecciones.TP2Colecciones;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList();
        Alumno alumno1 = new Alumno("Jorge", 10);
        Alumno alumno2 = new Alumno("Pablo", 8);
        Alumno alumno3 = new Alumno("Juan", 5);

        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);

        for (Alumno alumno: alumnos){
            System.out.println(alumno);
        }
    }
}
