package ejercicio3;

public class Perecedero extends Producto {

	private int caducaEn;

	/**
	 * @param nombre
	 * @param precio
	 * @param caducaEn Cuántos días le queda al producto para caducar
	 */
	public Perecedero(String nombre, double precio, int caducaEn) {
		super(nombre, precio);
		this.caducaEn = caducaEn;
	}

	/**
	 * @return caducaEn
	 */
	public int getCaducaEn() {
		return caducaEn;
	}

	/**
	 * @param caducaEn Setter
	 */
	public void setCaducaEn(int caducaEn) {
		this.caducaEn = caducaEn;
	}

	@Override
	public double calcular(int cantidad) {
		double op;
		
		op = super.calcular(cantidad);
		
		switch (caducaEn) {
		case 1 -> op /= 4;
		case 2 -> op /= 3;
		case 3 -> op /= 2;
		}
		
		return op;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCaduca en: " + this.caducaEn;
	}
	
}
