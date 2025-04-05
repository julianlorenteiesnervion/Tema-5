package comparator.ejercicio4;

import java.util.Comparator;

public abstract class Ficha implements Comparator<Ficha> {
	
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

	@Override
	public int compare(Ficha o1, Ficha o2) {
		return o1.getId() - o2.getId();
	}

}
