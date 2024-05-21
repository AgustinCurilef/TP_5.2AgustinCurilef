package ejercicio5version2;

import java.time.LocalDate;

public interface Inscribible {
    void nuevaInscripcion(Inscripcion inscripcion);
    boolean puedeInscribirse(LocalDate fechaInscripcion);
    boolean primerDiaInscripcion(LocalDate fechaIncripcion);
    boolean participanteInscripto(Participante participante);
    String obtenerId();
}
