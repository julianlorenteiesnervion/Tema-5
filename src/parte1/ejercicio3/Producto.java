package parte1.ejercicio3;

public class Producto {
	
	protected String nombre;
	protected double precio;
	
	/**
	 * @param nombre
	 * @param precio
	 */
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * @return El precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio Precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return El nombre
	 */
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nPrecio: " + precio;
	}
	
}
