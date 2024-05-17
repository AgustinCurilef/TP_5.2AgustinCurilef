package ejercicio3;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Exportable report1 = new Report("Contenido del reporte1 NO sobreescribible...");
        Exportable report2 = new Report("Contenido del reporte2 si sobreescribible...");

        // Especificar la ubicación y el nombre del archivo
      File file = new File("reporte.txt");
      File file2 = new File("reporte2.txt");

        try { //escribo el file 1
            report1.export(file);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"reporte1 file");
        }

        try {//no puedo sobreescribir el file 1 que habia escrito el reporte 1 con el reporte 3
          var report3 = new ReporteNoSobreescribible(report1);
          report3.export(file);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,e);
        }
        //
        try {//puedo escribir el file 2 con el reporte 2 y luego sobreescribirlo con el reporte1
            report2.export(file2);
            report1.export(file2);
        } catch (IOException e) {
            throw new RuntimeException("reporte2y1 file2 sobreescritura");
        }
        try {//sobreescribo de nuevo con el reporte 2 "comentar el try para ver como cambia el archivo"
            report2.export(file2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
