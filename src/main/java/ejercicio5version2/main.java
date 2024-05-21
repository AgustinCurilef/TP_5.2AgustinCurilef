package ejercicio5version2;

import persistenciaEjercicio1.EnBaseDatosRegistroInscripcion;
import persistenciaEjercicio1.EnDiscoRegistro;

import java.time.LocalDate;

public class main {

    public static void main(String[] args) {
        Participante jose1 = new Participante("234566", "Jose Perez", "jose.Perez@gmail.com");
        Participante pedro1 = new Participante("448899", "Pedro Perez", "Pedro.Perez@gmail.com");
        LocalDate fechaLimite = LocalDate.now();
        CorreoElectronico micuenta = new CorreoElectronico("fd5c2b624ae696", "78b2ddb2667cc9", "sandbox.smtp.mailtrap.io");
        var unConcurso = new Concurso("Un Ejercicio1.Concurso", fechaLimite.plusDays(3L), new EnBaseDatosRegistroInscripcion("jdbc:mysql://localhost:3306/tp1_objetos2", "root", ""));
        Concurso dosConcurso = new Concurso("Un Ejercicio1.Concurso", fechaLimite.plusDays(3L), new EnDiscoRegistro("C:\\Users\\MAK\\Documents\\Orientacion a Objetos 2(2024)\\Todos los TP\\Tp1POO2\\InscripcionConcurso.txt"));
        ProveedorDeFechas proveedor = new ProveedorDeFechas() {
            public LocalDate fecha() {
                return LocalDate.now();
            }
        };
        var unConcursoConEmail= new InscribibleConEnvioDeMail( micuenta, "concurso1@gmail.com", "Patron decorador con email", "Se ha registrado con exito",unConcurso);
       //con decorador --> envio mail
        Inscripcion.inscribirAEn(jose1, unConcursoConEmail, proveedor);
        // si envío mail
        Inscripcion.inscribirAEn(pedro1, dosConcurso, proveedor);
    }
}