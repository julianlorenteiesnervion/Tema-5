package analisis.ejercicio1;

public class Turismo extends Vehiculo {
	
	enum TipoUso {PROFESIONAL, PARTICULAR};
	
	private int numPlazas;
	private TipoUso uso;
	
	/**
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param matricula
	 * @param numPlazas
	 * @param uso
	 */
	public Turismo(String marca, String modelo, String color, String matricula, int numPlazas, String uso) {
		super(marca, modelo, color, matricula);
		this.numPlazas = numPlazas;
		
		switch (uso.toUpperCase()) {
		case "PROFESIONAL", "PARTICULAR" -> {
			this.uso = TipoUso.valueOf(uso);
		}
		default -> {
			this.uso = TipoUso.PARTICULAR;
		}
		}
	}

	public TipoUso getUso() {
		return uso;
	}

	public void setUso(String uso) {
		switch (uso.toUpperCase()) {
		case "PROFESIONAL", "PARTICULAR" -> {
			this.uso = TipoUso.valueOf(uso);
		}
		default -> {
			this.uso = TipoUso.PARTICULAR;
		}
		}
	}

	public int getNumPlazas() {
		return numPlazas;
	}

}
