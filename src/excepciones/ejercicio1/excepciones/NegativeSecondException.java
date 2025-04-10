package excepciones.ejercicio1.excepciones;

public class NegativeSecondException extends Exception {
	
	@Override
	public String toString() {
		return "Ha introducido segundos negativos.";
	}
	
	@Override
	public String getMessage() {
		return "Ha introducido segundos negativos.";
	}

}
