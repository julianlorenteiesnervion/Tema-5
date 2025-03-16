package ejercicio1;

public class HoraExacta extends Hora {

	private int segundo;

	/**
	 * @param hora
	 * @param minuto
	 * @param segundo
	 */
	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		
		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		}
	}

	/**
	 * @param segundo
	 * @return Devuelve si los segundos se han podido añadir
	 */
	public boolean setSegundo(int segundo) {
		boolean op = false;
		
		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
			
			op = true;
		}
		
		return op;
	}
	
	@Override
	public void inc() {
		if (segundo < 60) {
			segundo++;
		} else {
			segundo = 0;
			super.inc();
		}
	}

	@Override
	public String toString() {
		return super.toString() + ":" + segundo;
	}
	
}
