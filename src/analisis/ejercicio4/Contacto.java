package analisis.ejercicio4;

import java.util.Objects;

public class Contacto {

	private String nombre;
	private int telefono;
	
	/**
	 * @param nombre
	 * @param telefono
	 */
	public Contacto(String nombre, int telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	/**
	 * Método equals para comprobar si dos contactos son iguales
	 * @return Devuelve si los nombres de ambos contactos coinciden (true) o no (false)
	 */
	@Override
	public boolean equals(Object obj) {
		Contacto other = (Contacto) obj;
		return nombre.equals(other.nombre);
	}

	/**
	 * Método toString para modificar cómo imprimimos por pantalla los datos
	 */
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nTeléfono: " + telefono;
	}
	
}
