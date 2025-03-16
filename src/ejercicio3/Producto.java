package ejercicio3;

public class Producto {
	
	private String nombre;
	private double precio;
	
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
	
	/**
	 * @param cantidad
	 * @return Multiplicación del precio por la cantidad
	 */
	public double calcular(int cantidad) {
		return precio * cantidad;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nPrecio: " + precio;
	}
	
}
