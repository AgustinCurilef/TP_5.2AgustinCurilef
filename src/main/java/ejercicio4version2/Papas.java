package ejercicio4version2;

public class Papas extends PorcionAdicional{
    private double precioPapas;
    public Papas(Combo pedido) {
        super(pedido);
        precioPapas=10;
    }

    @Override
    public String descripcionDePedido() {
        return pedido.descripcionDePedido() +" + Papas fritas";
    }

    @Override
    public double precioPedido() {
        return pedido.precioPedido() + precioPapas;
    }
}
