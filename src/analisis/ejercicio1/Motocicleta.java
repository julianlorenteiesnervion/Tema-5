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
	
	/**
	 * Función para saber si la motocicleta necesita carnet para ser conducida
	 * @return Devuelve si la motocicleta se puede conducir sin necesidad de un carnet (se necesitará carnet cuando la cilindrada de la motocicleta sea igual o superior a 125 CC).
	 */
	public boolean requiereCarnet() {
		return cilindrada >= 125;
	}

}
