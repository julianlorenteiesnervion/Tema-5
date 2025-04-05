package comparator.ejercicio4;

public class Revista extends Ficha {

	private int numero;
	private int anno;
	
	/**
	 * @param id
	 * @param titulo
	 * @param numero
	 * @param anno
	 */
	public Revista(int id, String titulo, int numero, int anno) {
		super(id, titulo);
		this.numero = numero;
		this.anno = anno;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @return the anno
	 */
	public int getAnno() {
		return anno;
	}

	/**
	 * @return Devuelve la cantidad de días que se puede prestar
	 */
	@Override
	public int prestar() {
		return 10;
	}

	@Override
	public String toString() {
		return super.toString() + "\nNúmero: " + numero + "\nAño: " + anno;
	}
	
}
