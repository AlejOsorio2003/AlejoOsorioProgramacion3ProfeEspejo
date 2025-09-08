package LombockYDTO.TP3Lombok;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ProductoDTO> listaDTO = new ArrayList<>();

        ProductoDTO p1 = new ProductoDTO("001", "Teclado", 1500);
        ProductoDTO p2 = new ProductoDTO("002", "Mouse", 800);
        ProductoDTO p3 = new ProductoDTO("003", "Monitor", 12000);
        Producto p4 = new Producto("004", "Mouse", 1000, "Logitech");

        listaDTO.add(p1);
        listaDTO.add(p2);
        listaDTO.add(p3);

        System.out.println(listaDTO);
    }
}