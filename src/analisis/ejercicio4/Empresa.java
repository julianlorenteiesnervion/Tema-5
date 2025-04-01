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

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}
	
}
