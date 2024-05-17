package ejercicio4;

public class Main {
    public static void main(String[] args) {
        var basico= new ComboBasico("Combo Basico",50);
        var conPapasYQueso= new PorcionAdicional(new PorcionAdicional(basico,"queso",5), "papas",10);
        System.out.println(conPapasYQueso.descripcionDePedido()+" precio= "+conPapasYQueso.precioPedido());
    }
}
