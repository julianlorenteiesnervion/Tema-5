package interfaces.ejercicio2;

public class Futbolista implements Comparable<Futbolista> {
	
	private int numCamiseta;
	private String nombre;
	private int edad;
	private int numGoles;
	
	/**
	 * @param numCamiseta Número de la camiseta
	 * @param nombre Nombre del jugador
	 * @param edad Edad del jugador
	 * @param numGoles Número de goles del jugador
	 */
	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		this.numCamiseta = numCamiseta;
		this.nombre = nombre;
		this.edad = edad;
		this.numGoles = numGoles;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nEdad: " + edad + "\nNº Camiseta: " + numCamiseta + "\nNº Goles: " + numGoles;
	}

	@Override
	public boolean equals(Object obj) {
		Futbolista other = (Futbolista) obj;
		return nombre.equals(other.nombre) && numCamiseta == other.numCamiseta;
	}

	@Override
	public int compareTo(Futbolista f) {
		int res;
		
		if (numCamiseta < f.numCamiseta) {
			res = -1;
		} else if (numCamiseta > f.numCamiseta) {
			res = 1;
		} else {
			res = nombre.compareTo(f.nombre);
		}
		
		return res;
	}
}
