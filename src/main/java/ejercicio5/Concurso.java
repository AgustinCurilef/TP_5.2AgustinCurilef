package ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concurso implements Inscribible {
    private List<String> participantes;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String nombre;

    public Concurso(LocalDate fechaInicio, LocalDate fechaFin, String nombre) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombre = nombre;
        this.participantes = new ArrayList<>();
    }

    @Override
    public void inscribir(String nombreParticipante) {
        //if fecha de inscripcion entre inicio y fin
        this.participantes.add(nombreParticipante);
    }
}