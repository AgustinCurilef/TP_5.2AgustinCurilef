package ejercicio4version2;

public class Main {
    public static void main(String[] args) {
        var builder= new Combobuilder( new ComboSimple("Combo Basico",100));
       var comboFinal= builder.conQueso().conTomate().conCarne().conPapas().build();
       System.out.println(comboFinal.descripcionDePedido()+", Precio Final: "+comboFinal.precioPedido());
    }
}
