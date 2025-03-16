package ejercicio2;

public class Tecnico extends Operario {

	/**
	 * @param nombre
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Empleado " + super.nombre + " -> Operario -> Tecnico";
	}

}
