package excepciones.ejercicio2.clases;

import java.util.*;
import excepciones.ejercicio2.excepciones.*;

public class CuentaCorriente extends CuentaBancaria {

	private double porcentajeTransaccion;
	private int numTransacciones = 0;
	private List<Transaccion> transacciones = new ArrayList<>();
	
	/**
	 * @param saldo
	 * @param titular
	 * @param porcentajeTransaccion
	 * @param numTransacciones
	 * @param transacciones
	 */
	public CuentaCorriente(double saldo, Titular titular, double porcentajeTransaccion)
            throws SaldoInicialInvalidoException {

        super(saldo, titular);

        if (saldo < 0) {
            throw new SaldoInicialInvalidoException();
        }

        this.porcentajeTransaccion = porcentajeTransaccion;
    }

	public double getPorcentajeTransaccion() {
		return porcentajeTransaccion;
	}

	public void setPorcentajeTransaccion(double porcentajeTransaccion) {
		this.porcentajeTransaccion = porcentajeTransaccion;
	}

	public int getNumTransacciones() {
		return numTransacciones;
	}
	
	/**
	 * Añade una transacción a la lista de transacciones y actualiza el importe
	 * @param transaccion Transacción a añadir
	 * @return Devuelve si se ha podido añadir la transacción (true) o no (false)
	 */
	public boolean addTransaccion(Transaccion transaccion) {
		boolean op = false;
		
		if (transacciones.add(transaccion)) {
			super.setSaldo(super.getSaldo() + transaccion.getImporte());
		}
		
		return op;
	}

	public List<Transaccion> getTransacciones() {
		return transacciones;
	}
	
}
