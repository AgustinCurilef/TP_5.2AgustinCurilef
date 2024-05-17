package ejercicio1;

public class MotorElectricoAdapter implements Motor{
    private MotorElectrico motorElectronico;

    public MotorElectricoAdapter(MotorElectrico motorElectronico) {
        this.motorElectronico = motorElectronico;
    }

    @Override
    public void arrancar() {
        motorElectronico.conectarYActivar();
    }

    @Override
    public void acelerar() {
        motorElectronico.moverMasRapido();
    }

    @Override
    public void apagar() {
        motorElectronico.detenerYDesconectar();
    }
}
