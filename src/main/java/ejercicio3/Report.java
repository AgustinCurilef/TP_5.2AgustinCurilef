package ejercicio3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Report implements Exportable{
    private String reporte;

    public Report(String reporte) {
        this.reporte = reporte;
    }

    public void export(File file) throws IOException {
        // Exportar el reporte a un archivo.
        FileWriter write= new FileWriter(file);
        write.write(reporte);
        write.close();
    }

}