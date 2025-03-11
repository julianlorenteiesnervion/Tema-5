package parte1.ejercicio2;

public class Directivo extends Empleado {

	/**
	 * @param nombre
	 */
	public Directivo(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Empleado " + super.nombre + " -> Directivo";
	}

}
