package ejercicio1;

import javax.swing.*;

public class MotorComun implements Motor{
    @Override
    public void arrancar() {
        JOptionPane.showMessageDialog(null, "Arranco motor comun");
    }

    @Override
    public void acelerar() {
        JOptionPane.showMessageDialog(null, "Acelerando motor comun");
    }

    @Override
    public void apagar() {
        JOptionPane.showMessageDialog(null, "Apagado motor comun");
    }
}
