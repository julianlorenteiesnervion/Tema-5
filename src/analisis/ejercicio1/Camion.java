package analisis.ejercicio1;

public class Camion extends Vehiculo {

	private int pesoMaxAutorizado;
	private boolean mercanciaPeligrosa;
	
	/**
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param matricula
	 * @param pesoMaxAutorizado
	 * @param mercanciaPeligrosa
	 */
	public Camion(String marca, String modelo, String color, String matricula, int pesoMaxAutorizado,
			boolean mercanciaPeligrosa) {
		super(marca, modelo, color, matricula);
		this.pesoMaxAutorizado = pesoMaxAutorizado;
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}
	
	public int getPesoMaxAutorizado() {
		return pesoMaxAutorizado;
	}

	public boolean getMercanciaPeligrosa() {
		return mercanciaPeligrosa;
	}

	public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}
	
}
