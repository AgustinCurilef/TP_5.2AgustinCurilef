package ejercicio1;

import javax.swing.*;

public class MotorEconocomico implements Motor{
    @Override
    public void arrancar() {
        JOptionPane.showMessageDialog(null, "Arranco motor Economico");
    }

    @Override
    public void acelerar() {
        JOptionPane.showMessageDialog(null, "Acelerando motor Economico");
    }

    @Override
    public void apagar() {
        JOptionPane.showMessageDialog(null, "Apagado motor Economico");
    }
}
