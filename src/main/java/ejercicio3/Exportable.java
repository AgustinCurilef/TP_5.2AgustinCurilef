package ejercicio3;

import java.io.File;
import java.io.IOException;

public interface Exportable {
    void export(File file) throws IOException;
}
