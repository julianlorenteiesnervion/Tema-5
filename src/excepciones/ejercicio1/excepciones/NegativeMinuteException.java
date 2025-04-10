package excepciones.ejercicio1.excepciones;

public class NegativeMinuteException extends Exception {
	
	@Override
	public String toString() {
		return "Ha introducido minutos negativos.";
	}
	
	@Override
	public String getMessage() {
		return "Ha introducido minutos negativos.";
	}

}
