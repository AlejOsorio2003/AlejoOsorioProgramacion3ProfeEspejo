package LombockYDTO.TP3Lombok;

public class Producto {
    private String codigo;
    private String nombre;
    private int precio;
    private String autor;

    public Producto(String codigo, String nombre, int precio, String autor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", autor='" + autor + '\'' +
                '}';
    }
}
