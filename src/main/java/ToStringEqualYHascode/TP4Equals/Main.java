package ToStringEqualYHascode.TP4Equals;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<Producto>();

        Producto producto1 = new Producto("Camiseta", "12345", 150);
        Producto producto2 = new Producto("Camiseta", "67890", 150);
        Producto producto3 = new Producto("Pantalón", "12345", 120);

        if (!productos.contains(producto1)) {productos.add(producto1);}
        if (!productos.contains(producto2)) {productos.add(producto2);}
        if (!productos.contains(producto3)) {productos.add(producto3);}

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
