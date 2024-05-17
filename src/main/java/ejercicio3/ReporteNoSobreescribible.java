package ejercicio3;

import java.io.File;
import java.io.IOException;

public class ReporteNoSobreescribible implements Exportable {
    private Exportable report;

    public ReporteNoSobreescribible(Exportable report) {
        this.report = report;
    }

    @Override
    public void export(File file) throws IOException {
        if (file.exists()) {
            throw new IOException(
                    "El archivo ya existe y no se permite sobrescribir..."
            );
        }
        report.export(file);

    }
}
