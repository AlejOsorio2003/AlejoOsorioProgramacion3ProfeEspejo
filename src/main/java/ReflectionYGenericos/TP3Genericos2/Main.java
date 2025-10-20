package ReflectionYGenericos.TP3Genericos2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaDeStrings = new ArrayList<>();
        listaDeStrings.add("UTN");
        listaDeStrings.add("Programación III");

        List<Integer> listaDeEnteros = new ArrayList<>();
        listaDeEnteros.add(10);
        listaDeEnteros.add(20);

        Utilidades.imprimirLista(listaDeStrings);
        Utilidades.imprimirLista(listaDeEnteros);
    }
}
