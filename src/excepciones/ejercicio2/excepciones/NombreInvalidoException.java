package excepciones.ejercicio2.excepciones;

public class NombreInvalidoException extends Exception {
    @Override
    public String getMessage() {
        return "El nombre no puede estar vacío.";
    }

    @Override
    public String toString() {
        return "NombreInvalidoException: " + getMessage();
    }
}
