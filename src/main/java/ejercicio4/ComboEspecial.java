package ejercicio4;

import ejercicio4version2.Combo;

public class ComboEspecial  implements Combo {
    private String descripcion;
    private double precio;

    public ComboEspecial(String descripcion, double precio) {
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

