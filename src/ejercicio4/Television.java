package ejercicio4;

public class Television extends Electrodomestico {
	
	private int resolucion = 20;
	private boolean sintonizadorTDT = false;
	
	/**
	 * @param precioBase
	 * @param peso
	 */
	public Television(int precioBase, int peso) {
		super(precioBase, peso);
	}

	/**
	 * @param precioBase
	 * @param color
	 * @param consumo
	 * @param peso
	 * @param resolucion
	 * @param sintonizadorTDT
	 */
	public Television(int precioBase, String color, char consumo, int peso, int resolucion, boolean sintonizadorTDT) {
		super(precioBase, color, consumo, peso);
		
		if (resolucion != 20) {
			this.resolucion = resolucion;
		}
		
		if (sintonizadorTDT) {
			this.sintonizadorTDT = sintonizadorTDT;
		}
	}

	/**
	 * @return the resolucion
	 */
	public int getResolucion() {
		return resolucion;
	}

	/**
	 * @param resolucion the resolucion to set
	 */
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	/**
	 * @return the sintonizadorTDT
	 */
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	/**
	 * @param sintonizadorTDT the sintonizadorTDT to set
	 */
	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}

}
