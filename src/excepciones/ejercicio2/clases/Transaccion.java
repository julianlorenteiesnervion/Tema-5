package excepciones.ejercicio2.clases;

public class Transaccion {

	private int dia;
	private int mes;
	private int anno;
	private String concepto;
	private double importe;
	
	/**
	 * @param dia
	 * @param mes
	 * @param anno
	 * @param concepto
	 * @param importe
	 */
	public Transaccion(int dia, int mes, int anno, String concepto, double importe) {
		if (dia >= 0 && dia <= 31 && mes >= 1 && mes <= 12) {
			this.dia = dia;
			this.mes = mes;
		}
		
		this.anno = anno;
		this.concepto = concepto;
		this.importe = importe; // Una transacción puede tener un importe negativo (retirada)
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnno() {
		return anno;
	}

	public String getConcepto() {
		return concepto;
	}

	public double getImporte() {
		return importe;
	}
	
}
