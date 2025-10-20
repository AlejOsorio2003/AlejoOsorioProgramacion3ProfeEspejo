package ReflectionYGenericos.TP3Genericos2;

import java.util.List;

public class Utilidades {
    public static <T> void imprimirLista(List<T> lista) {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }
}
