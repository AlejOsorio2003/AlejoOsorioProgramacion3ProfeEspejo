package LombockYDTO.TP4Lombok;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("A01", "Auriculares", "Sony", 4500.0);
        Producto producto2 = new Producto("B02", "Teclado", "Logitech", 7200.0);
        Producto producto3 = new Producto("C03", "Monitor", "Samsung", 32000.0);

        ProductoRecord productoR1 = new ProductoRecord(producto1.getCodigo(), producto1.getNombre(), producto1.getPrecio());
        ProductoRecord productoR2 = new ProductoRecord(producto2.getCodigo(), producto2.getNombre(), producto2.getPrecio());
        ProductoRecord productoR3 = new ProductoRecord(producto3.getCodigo(), producto3.getNombre(), producto3.getPrecio());

        List<ProductoRecord> productos = new ArrayList<ProductoRecord>();
        productos.add(productoR1);
        productos.add(productoR2);
        productos.add(productoR3);

        for (ProductoRecord producto : productos) {
            System.out.println(producto);
        }
    }
}