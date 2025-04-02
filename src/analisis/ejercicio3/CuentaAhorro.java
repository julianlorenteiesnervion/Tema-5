package analisis.ejercicio3;

public class CuentaAhorro extends CuentaBancaria {

	private double cuotaMantenimiento;
	private double interesAnual;
	
	/**
	 * @param saldo
	 * @param titular
	 * @param cuotaMantenimiento
	 * @param interesAnual
	 */
	public CuentaAhorro(double saldo, Titular titular, double cuotaMantenimiento, double interesAnual) {
		super(saldo, titular);
		
		this.cuotaMantenimiento = cuotaMantenimiento;
		this.interesAnual = interesAnual;
	}

	public double getCuotaMantenimiento() {
		return cuotaMantenimiento;
	}

	public void setCuotaMantenimiento(double cuotaMantenimiento) {
		this.cuotaMantenimiento = cuotaMantenimiento;
	}

	public double getInteresAnual() {
		return interesAnual;
	}

	public void setInteresAnual(double interesAnual) {
		this.interesAnual = interesAnual;
	}
	
	/**
	 * Método para obtener el saldo con el interés anual aplicado
	 * @return Devuelve el saldo con el interés anual aplicado
	 */
	public double saldoInteres() {
		return super.getSaldo() + (super.getSaldo() * (interesAnual / 100));
	}
	
	/**
	 * Retira de la cuenta la cuota de mantenimiento
	 */
	public void restarCuota() {
		super.retirar(cuotaMantenimiento);
	}
	
}
