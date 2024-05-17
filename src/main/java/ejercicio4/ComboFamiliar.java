package ejercicio4;

import ejercicio4version2.Combo;

public class ComboFamiliar  implements Combo {
    private String descripcion;
    private double precio;

    public ComboFamiliar(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String descripcionDePedido() {
        return descripcion +" "+ precio;
    }

    @Override
    public double precioPedido() {
        return precio;
    }
}
