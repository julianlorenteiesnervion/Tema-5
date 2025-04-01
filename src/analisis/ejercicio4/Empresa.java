package analisis.ejercicio4;

public class Empresa extends Contacto {
	
	private String paginaWeb;

	/**
	 * @param nombre
	 * @param telefono
	 * @param paginaWeb
	 */
	public Empresa(String nombre, int telefono, String paginaWeb) {
		super(nombre, telefono);
		this.paginaWeb = paginaWeb;
	}
	
	/**
	 * Constructor para la modificación de contactos
	 * @param nombre Nombre del contacto
	 */
	public Empresa(String nombre) {
		super(nombre);
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	@Override
	public String toString() {
		return super.toString() + "\nPágina web: " + paginaWeb;
	}
	
}
