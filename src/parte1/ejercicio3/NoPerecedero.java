package parte1.ejercicio3;

public class NoPerecedero extends Producto {

	private String tipo;

	/**
	 * @param nombre
	 * @param precio
	 * @param tipo
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	/**
	 * @return el tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo Setter tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTipo: " + this.tipo;
	}
	
}
