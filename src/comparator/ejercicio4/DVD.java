package comparator.ejercicio4;

public class DVD extends Ficha {
	
	enum Tipo {PELICULA, DOCUMENTAL, SERIE};
	
	private String director;
	private int anno;
	private Tipo tipo;
	
	/**
	 * @param id
	 * @param titulo
	 * @param director
	 * @param anno
	 * @param tipo
	 */
	public DVD(int id, String titulo, String director, int anno, String tipo) {
		super(id, titulo);
		this.director = director;
		this.anno = anno;
		
		switch (tipo.toUpperCase()) {
		case "PELICULA", "DOCUMENTAL", "SERIE" -> {
			this.tipo = Tipo.valueOf(tipo.toUpperCase());
		}
		default -> {
			this.tipo = Tipo.PELICULA;
		}
		}
	}

	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @return the anno
	 */
	public int getAnno() {
		return anno;
	}

	/**
	 * @return the tipo
	 */
	public Tipo getTipo() {
		return tipo;
	}

	/**
	 * @return Devuelve la cantidad de días que se puede prestar
	 */
	@Override
	public int prestar() {
		return 5;
	}

	@Override
	public String toString() {
		return super.toString() + "\nDirector: " + director + "\nAño: " + anno + "\nTipo: " + tipo;
	}
	
}
