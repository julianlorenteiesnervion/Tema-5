package parte1.ejercicio1;

public class Hora {
	protected int hora;
	protected int minuto;
	
	/**
	 * @param hora
	 * @param minuto
	 */
	public Hora(int hora, int minuto) {
		if ((hora >= 0 && hora <= 23) && (minuto >= 0 && minuto <= 59)) {
			this.hora = hora;
			this.minuto = minuto;
		}
	}
	
	public void inc() {
		if (minuto < 60) {
			minuto++;
		} else {
			minuto = 0;
			hora++;
		}
		
		if (hora >= 24) {
			hora = 0;
		}
	}
	
	/**
	 * 
	 * @param minutos Minutos a modificar
	 * @return Devuelve si se ha podido modificar los minutos
	 */
	public boolean setMinutos(int minutos) {
		boolean op = false;
		
		if (minutos >= 0 && minutos <= 59) {
			this.minuto = minutos;
			op = true;
		}
		
		return op;
	}
	
	/**
	 * 
	 * @param hora Hora a modificar
	 * @return Devuelve si se ha podido modificar la hora
	 */
	public boolean setHora(int hora) {
		boolean op = false;
		
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
			op = true;
		}
		
		return op;
	}

	@Override
	public String toString() {
		return hora + ":" + minuto;
	}
}
