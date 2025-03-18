package ejercicio4;

public class Lavadora extends Electrodomestico {

	private int carga = 5;
	
	/**
	 * @param precioBase
	 * @param peso
	 */
	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
	}

	/**
	 * @param precioBase
	 * @param color
	 * @param consumo
	 * @param peso
	 * @param carga
	 */
	public Lavadora(int precioBase, String color, char consumo, int peso, int carga) {
		super(precioBase, color, consumo, peso);
		this.carga = carga;
	}

	/**
	 * @return La carga
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * @param carga Setter de la carga
	 */
	public void setCarga(int carga) {
		this.carga = carga;
	}

	@Override
	public void precioFinal() {
		super.precioFinal();
		
		if (carga > 30) {
			super.precioBase += 50;
		}
		
	}

}
