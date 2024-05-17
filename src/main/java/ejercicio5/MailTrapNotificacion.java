package ejercicio5;
public class MailTrapNotificacion implements Notificacion {

    private String smtp;

    public MailTrapNotificacion(String smtp) {
        this.smtp = smtp;
    }

    @Override
    public void notificar(String mensaje) {
        // enviando mail...
        System.out.println("enviando mail...");
    }
}