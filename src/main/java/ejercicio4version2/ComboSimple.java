package ejercicio4version2;

public class ComboSimple implements Combo {
    private String descripcion;
    private double precio;

    public ComboSimple(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }
    @Override
    public String descripcionDePedido() {
        return descripcion;
    }

    @Override
    public double precioPedido() {
        return precio;
    }
}
