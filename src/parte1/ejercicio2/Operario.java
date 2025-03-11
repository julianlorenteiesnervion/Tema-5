package parte1.ejercicio2;

public class Operario extends Empleado {

	/**
	 * @param nombre
	 */
	public Operario(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Empleado " + super.nombre + " -> Operario";
	}

}
