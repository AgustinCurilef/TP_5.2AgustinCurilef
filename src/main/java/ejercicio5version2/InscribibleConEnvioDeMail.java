package ejercicio5version2;


import java.time.LocalDate;

public class InscribibleConEnvioDeMail implements Inscribible {
    private Notificacion miCuenta;
    private String remitente;
    private String asunto;
    private String mensaje;
    private Inscribible inscribible;
    public InscribibleConEnvioDeMail(Notificacion miCuenta, String remitente, String asunto, String mensaje, Inscribible inscribible) {
        this.miCuenta = miCuenta;
        this.remitente = remitente;
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.inscribible = inscribible;
    }


    @Override
    public void nuevaInscripcion(Inscripcion inscripcion) {
        inscribible.nuevaInscripcion(inscripcion);
        this.miCuenta.enviarNotificacion(inscripcion.obtenerCorreo(), this.remitente, this.asunto, this.mensaje);
    }

    @Override
    public boolean puedeInscribirse(LocalDate fechaInscripcion) {
        return inscribible.puedeInscribirse(fechaInscripcion);
    }

    @Override
    public boolean primerDiaInscripcion(LocalDate fechaIncripcion) {
        return inscribible.primerDiaInscripcion(fechaIncripcion);
    }

    @Override
    public boolean participanteInscripto(Participante participante) {
        return inscribible.participanteInscripto(participante);
    }

    @Override
    public String obtenerId() {
        return inscribible.obtenerId();
    }
}
