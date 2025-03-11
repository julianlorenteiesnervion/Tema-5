package parte1.ejercicio2;

public class Empleado {

	protected String nombre;

	/**
	 * @param nombre
	 */
	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre Nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado " + nombre;
	}
	
}
