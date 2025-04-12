package excepciones.ejercicio2.excepciones;

public class DniInvalidoException extends Exception {
    @Override
    public String getMessage() {
        return "El DNI no puede estar vacío.";
    }

    @Override
    public String toString() {
        return "DniInvalidoException: " + getMessage();
    }
}
