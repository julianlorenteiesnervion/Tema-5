package analisis.ejercicio2;

public abstract class Ficha {
	
	private int id;
	private String titulo;
	
	/**
	 * @param id
	 * @param titulo
	 */
	public Ficha(int id, String titulo) {
		super();
		this.id = id;
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}
	
	public abstract int prestar();

	@Override
	public String toString() {
		return "ID: " + id + "\nTítulo: " + titulo;
	}

}
