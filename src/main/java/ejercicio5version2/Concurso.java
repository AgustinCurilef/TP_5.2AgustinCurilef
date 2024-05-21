package ejercicio5version2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Concurso implements Inscribible {

    private final String nombre;
    private final LocalDate fechaLimite;
    private final String idConcurso;
    private final List<Inscripcion> inscriptos;
    private final LocalDate fechaInicio;
    private final Registro registro;
    private String listaInscriptos;

    public Concurso(String nombre, LocalDate fechaLimite, Registro registro) {
        this.nombre = nombre;
        this.fechaLimite = fechaLimite;
        this.fechaInicio = LocalDate.now();
        this.inscriptos = new ArrayList();
        Random random= new Random();
        this.idConcurso =""+ random.nextInt(10);
        this.registro = registro;
    }

    public boolean participanteInscripto(Participante participante) {
        return this.inscriptos.stream().anyMatch((inscripcion) -> {
            return inscripcion.estaInscripto(participante);
        });
    }

    public void nuevaInscripcion(Inscripcion inscripcion) {
        this.inscriptos.add(inscripcion);
        this.registro.registrar(inscripcion.toString());
    }

    public boolean puedeInscribirse(LocalDate fechaInscripcion) {
        return (this.fechaInicio.isBefore(fechaInscripcion) || this.fechaInicio.isEqual(fechaInscripcion)) && (this.fechaLimite.isAfter(fechaInscripcion) || this.fechaLimite.isEqual(fechaInscripcion));
    }

    public int cantidadInscriptos() {
        return this.inscriptos.size();
    }

    public boolean primerDiaInscripcion(LocalDate fechaIncripcion) {
        return fechaIncripcion.isEqual(this.fechaInicio);
    }

    public String obtenerId() {
        return this.idConcurso;
    }
}

