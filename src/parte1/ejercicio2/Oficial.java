package parte1.ejercicio2;

public class Oficial extends Operario {

	/**
	 * @param nombre
	 */
	public Oficial(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Empleado " + super.nombre + " -> Operario -> Oficial";
	}

}
