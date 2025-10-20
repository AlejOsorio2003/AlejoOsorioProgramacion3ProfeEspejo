package ReflectionYGenericos.TP2Genericos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Caja<String> cajaDeTexto = new Caja<>();
        cajaDeTexto.guardar("Hola UTN");
        System.out.println("Caja<String>: " + cajaDeTexto.obtener());

        Caja<Integer> cajaDeNumero = new Caja<>();
        cajaDeNumero.guardar(123);
        System.out.println("Caja<Integer>: " + cajaDeNumero.obtener());

        List lista = new ArrayList();
        lista.add("Texto");
        lista.add(456);

        String texto = (String) lista.get(0);
        int numero = (int) lista.get(1);

        System.out.println("Sin genéricos: " + texto + ", " + numero);
    }
}
