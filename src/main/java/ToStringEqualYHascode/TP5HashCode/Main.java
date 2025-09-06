package ToStringEqualYHascode.TP5HashCode;

import ToStringEqualYHascode.TP4Equals.Producto;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Celular", "2112", 12800);
        Producto p2 = new Producto("Celular", "2113", 12800);
        Producto p3 = new Producto("Celular", "2112", 12800);
        Producto p4 = new Producto("Tablet", "2115", 18800);
        Producto p5 = new Producto("Tablet", "2115", 18800);
        Producto p6 = new Producto("Tablet", "2112", 18800);

        HashSet<Producto> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        set.add(p6);

        for (Producto producto : set) {
            System.out.println(producto);
        }
    }
}
