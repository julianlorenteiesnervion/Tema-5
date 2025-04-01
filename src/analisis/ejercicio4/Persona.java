package analisis.ejercicio4;

public class Persona extends Contacto {

	private String fecha;

	/**
	 * @param nombre
	 * @param telefono
	 * @param fecha
	 */
	public Persona(String nombre, int telefono, String fecha) {
		super(nombre, telefono);
		this.fecha = fecha;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return super.toString() + "\nFecha: " + fecha;
	}
	
}
