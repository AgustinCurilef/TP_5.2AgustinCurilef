package ejercicio5;

public class InscribibleConEnvioDeEmail  implements Inscribible{
    private Inscribible inscribible;
    private Notificacion notificacion;

    public InscribibleConEnvioDeEmail(Inscribible inscribible, Notificacion notificacion) {
        this.inscribible = inscribible;
        this.notificacion = notificacion;
    }

    @Override
    public void inscribir(String nombreParticipante) {
        inscribible.inscribir(nombreParticipante);
        this.notificacion.notificar("Usted se ha inscripto al concurso: " + nombreParticipante);
    }
}
