package ProgramacionFuncional.Funcional2;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = List.of(
                new Producto("Monitor", "Electrónica", 150.0, 10),
                new Producto("Mouse", "Electrónica", 50.0, 30),
                new Producto("Mesa", "Muebles", 200.0, 5),
                new Producto("Silla", "Muebles", 120.0, 15),
                new Producto("Lámpara", "Decoración", 80.0, 20),
                new Producto("Cuadro", "Decoración", 130.0, 8)
        );

        List<Producto> caros = productos.stream()
                .filter(p -> p.getPrecio() > 100)
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .collect(Collectors.toList());

        System.out.println("Productos > $100:");
        caros.forEach(System.out::println);

        Map<String, Integer> stockPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.summingInt(Producto::getStock)
                ));

        System.out.println("Stock total por categoría:");
        stockPorCategoria.forEach((cat, stock) -> System.out.println(cat + ": " + stock));

        String resumen = productos.stream()
                .map(p -> p.getNombre() + " $" + p.getPrecio())
                .collect(Collectors.joining(", "));

        System.out.println("Resumen de productos:");
        System.out.println(resumen);

        double promedioGeneral = productos.stream()
                .mapToDouble(Producto::getPrecio)
                .average()
                .orElse(0.0);

        System.out.println("Precio promedio general: " + promedioGeneral);

        Map<String, Double> promedioPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.averagingDouble(Producto::getPrecio)
                ));

        System.out.println("Precio promedio por categoría:");
        promedioPorCategoria.forEach((cat, prom) -> System.out.println(cat + ": " + prom));
    }
}