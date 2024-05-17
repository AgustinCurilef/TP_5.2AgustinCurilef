package ejercicio4version2;

public class Tomate extends PorcionAdicional{
    private double precioTomate;
    public Tomate(Combo pedido) {
        super(pedido);
        precioTomate=3;
    }

    @Override
    public String descripcionDePedido() {
        return pedido.descripcionDePedido()+" + Tomate";
    }

    @Override
    public double precioPedido() {
        return pedido.precioPedido()+precioTomate;
    }
}
