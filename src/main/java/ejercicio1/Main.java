package ejercicio1;

public class Main {
    public static void main(String[] args) {
        var motorComun= new MotorComun();
        var motorEconomico= new MotorEconocomico();
        var motorElectricoAdapter= new MotorElectricoAdapter(new MotorElectrico());
        motorComun.arrancar();
        motorEconomico.acelerar();
        motorElectricoAdapter.apagar();
    }
}
