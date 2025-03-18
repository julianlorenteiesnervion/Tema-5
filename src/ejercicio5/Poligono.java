package ejercicio5;

public abstract class Poligono {

	private int numeroLados;
	
	public abstract double area();

	/**
	 * @param numeroLados
	 */
	public Poligono(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	/**
	 * @return numeroLados
	 */
	public int getNumeroLados() {
		return numeroLados;
	}

	@Override
	public String toString() {
		return "Nº Lados: " + numeroLados + "\tTipo: ";
	}
}
