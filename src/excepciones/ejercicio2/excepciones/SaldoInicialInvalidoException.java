package excepciones.ejercicio2.excepciones;

public class SaldoInicialInvalidoException extends Exception {
    @Override
    public String getMessage() {
        return "El saldo inicial no puede ser negativo.";
    }

    @Override
    public String toString() {
        return "SaldoInicialInvalidoException: " + getMessage();
    }
}
