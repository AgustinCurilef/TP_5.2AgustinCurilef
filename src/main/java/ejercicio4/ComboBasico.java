package ejercicio4;

import ejercicio4version2.Combo;

public class ComboBasico implements Combo {
    private String descripcion;
    private double precio;

    public ComboBasico(String descripcion, double precio) {
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
