package analisis.ejercicio3;

public class Titular {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private int telefono;
	
	/**
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param telefono
	 */
	public Titular(String dni, String nombre, String apellidos, int telefono) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}
		
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		
		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
		
		this.telefono = telefono;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}
	
}
