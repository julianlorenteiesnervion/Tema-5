package excepciones.ejercicio1.excepciones;

public class NegativeHourException extends Exception {
	
	@Override
	public String toString() {
		return "Ha introducido una hora negativa.";
	}
	
	@Override
	public String getMessage() {
		return "Ha introducido una hora negativa.";
	}

}
