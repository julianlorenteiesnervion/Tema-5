package excepciones.ejercicio1.clases;

import excepciones.ejercicio1.excepciones.*;

public class Hora {
	private int hora;
	private int minuto;
	
	/**
	 * @param hora
	 * @param minuto
	 */
	public Hora(int hora, int minuto) throws NegativeHourException, NegativeMinuteException {
		if (hora < 0) {
			throw new NegativeHourException();
		} else {
			this.hora = hora;
		}
		
		if (minuto < 0) {
			throw new NegativeMinuteException();
		} else {
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
	public boolean setMinutos(int minutos) throws NegativeMinuteException {
		boolean op = false;
		
		if (minuto < 0) {
			throw new NegativeMinuteException();
		} else {
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
	public boolean setHora(int hora) throws NegativeHourException {
		boolean op = false;
		
		if (hora < 0) {
			throw new NegativeHourException();
		} else {
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
