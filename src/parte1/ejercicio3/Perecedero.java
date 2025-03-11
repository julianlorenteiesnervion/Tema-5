package parte1.ejercicio3;

public class Perecedero extends Producto {

	protected int caducaEn;

	/**
	 * @param nombre
	 * @param precio
	 * @param caducaEn Cuántos días le queda al producto para caducar
	 */
	public Perecedero(String nombre, double precio, int caducaEn) {
		super(nombre, precio);
		this.caducaEn = caducaEn;
	}
}
