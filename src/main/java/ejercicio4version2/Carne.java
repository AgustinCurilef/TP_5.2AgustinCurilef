package ejercicio4version2;

public class Carne extends PorcionAdicional{
    private double precioCarne;
    public Carne(Combo pedido) {
        super(pedido);
        precioCarne=15;
    }

    @Override
    public String descripcionDePedido() {
        return pedido.descripcionDePedido()+" + Carne";
    }

    @Override
    public double precioPedido() {
        return pedido.precioPedido()+precioCarne;
    }
}
