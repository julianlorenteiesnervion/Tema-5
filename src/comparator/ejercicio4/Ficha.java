package comparator.ejercicio4;

import java.util.Comparator;

public abstract class Ficha implements Comparable<Ficha> {
	
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
	public int compareTo(Ficha o1) {
		return id - o1.getId();
	}

}
