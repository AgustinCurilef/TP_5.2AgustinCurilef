package ejercicio4;

import ejercicio4version2.Combo;

public class PorcionAdicional implements Combo {
    private Combo pedido;
    private String porcionAdicional;
    private double precioAdicional;

    public PorcionAdicional(Combo pedido, String porcionAdicional, double precioAdicional) {
        this.pedido = pedido;
        this.porcionAdicional= porcionAdicional;
        this.precioAdicional= precioAdicional;
    }

    @Override
    public String descripcionDePedido() {
        var informacionPedido= pedido.descripcionDePedido() + "+"+porcionAdicional;
        return informacionPedido;
    }

    @Override
    public double precioPedido() {
        return pedido.precioPedido()+precioAdicional ;
    }
}
