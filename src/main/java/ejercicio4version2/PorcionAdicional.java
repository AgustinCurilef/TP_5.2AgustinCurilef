package ejercicio4version2;


public abstract  class  PorcionAdicional implements Combo {
    protected Combo pedido;

    public PorcionAdicional(Combo pedido) {
        this.pedido = pedido;

    }
}
