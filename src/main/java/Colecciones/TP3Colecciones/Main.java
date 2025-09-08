package Colecciones.TP3Colecciones;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Producto> productos = new HashSet<Producto>();

        Producto producto1 = new Producto("1234", "Lavarropas");
        Producto producto2 = new Producto("2345", "Lavarropas");
        Producto producto3 = new Producto("3456", "Termotanque");
        Producto producto4 = new Producto("1234", "Termotanque");
        Producto producto5 = new Producto("1234", "Lavarropas");

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
