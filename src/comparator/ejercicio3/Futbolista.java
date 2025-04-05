package comparator.ejercicio3;

public class Futbolista {

	private String nombre;
	private int edad;
	private int goles;
	
	/**
	 * @param nombre
	 * @param edad
	 * @param goles
	 */
	public Futbolista(String nombre, int edad, int goles) {
		this.nombre = nombre;
		this.edad = edad;
		this.goles = goles;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "| Edad: " + edad + "| Goles: " + goles;
	}
	
}
