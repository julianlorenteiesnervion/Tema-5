package excepciones.ejercicio2.clases;

import java.util.Objects;
import excepciones.ejercicio2.excepciones.*;

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
	public Titular(String dni, String nombre, String apellidos, int telefono)
	        throws DniInvalidoException, NombreInvalidoException {

	    if (dni == null || dni.isBlank()) {
	        throw new DniInvalidoException();
	    }

	    if (nombre == null || nombre.isBlank()) {
	        throw new NombreInvalidoException();
	    }

	    this.dni = dni;
	    this.nombre = nombre;
	    this.apellidos = apellidos;
	    this.telefono = telefono;
	}

	
	// Constructor para actualizaciones
	public Titular(String dni) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}
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

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	/**
	 * Devuelve si dos titulares son iguales (es decir, si tienen el mismo dni)
	 */
	@Override
	public boolean equals(Object obj) {
		Titular other = (Titular) obj;
		return dni.equals(other.dni);
	}
	
}
