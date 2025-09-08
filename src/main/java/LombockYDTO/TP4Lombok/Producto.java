package LombockYDTO.TP4Lombok;

import lombok.*;

@Setter @Getter @ToString @AllArgsConstructor @NoArgsConstructor

public class Producto {
    private String codigo;
    private String nombre;
    private String proveedor;
    private double precio;
}
