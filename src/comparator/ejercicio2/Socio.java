package comparator.ejercicio2;

public class Socio implements Comparable<Socio>{

	private int id;
	private String nombre;
	private int edad;
	
	/**
	 * @param id
	 * @param nombre
	 * @param edad
	 */
	public Socio(int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	/**
	 * @return El nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "ID: " + id + "\nNombre: " + nombre + "\nEdad: " + edad;
	}

	@Override
	public int compareTo(Socio socio) {
		int res = 0;
		
		if (socio.id > this.id) {
			res = -1;
		} else if (socio.id < this.id) {
			res = 1;
		}
		
		return res;
	}
	
}
