package ejercicio4version2;

public class Queso extends PorcionAdicional{
    private double precioQueso;
    public Queso(Combo pedido) {
        super(pedido);
        precioQueso=5;
    }

    @Override
    public String descripcionDePedido() {
        return pedido.descripcionDePedido() + " + Queso";
    }

    @Override
    public double precioPedido() {
        return pedido.precioPedido() + precioQueso;
    }
}
