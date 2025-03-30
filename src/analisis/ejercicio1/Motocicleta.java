package analisis.ejercicio1;

public class Motocicleta extends Vehiculo {
	
	private int cilindrada;

	/**
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param matricula
	 * @param cilindrada
	 */
	public Motocicleta(String marca, String modelo, String color, String matricula, int cilindrada) {
		super(marca, modelo, color, matricula);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public boolean requiereCarnet() {
		return cilindrada >= 125;
	}

}
