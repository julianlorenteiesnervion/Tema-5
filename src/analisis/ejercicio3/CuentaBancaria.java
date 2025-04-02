package analisis.ejercicio3;

import java.util.*;

public class CuentaBancaria {

	private static int numCuentaGlobal = 0;
	
	private final int numCuenta;
	private double saldo;
	private int numTitulares = 1;
	private List<Titular> titulares = new ArrayList<>();
	
	/**
	 * @param numCuenta
	 * @param saldo
	 * @param numTitulares
	 * @param titulares
	 */
	public CuentaBancaria(double saldo, Titular titular) {
		this.numCuenta = numCuentaGlobal;
		numCuentaGlobal++;
		
		this.saldo = saldo;
		
		this.titulares.add(titular);
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public List<Titular> getTitulares() {
		return titulares;
	}
	
	/**
	 * Método para ingresar saldo
	 * @param cantidad Cantidad a incrementar
	 * @return Devuelve si se ha podido ingresar la cantidad (si es mayor que 0)
	 */
	public boolean ingresar(int cantidad) {
		boolean op = false;
		
		if (cantidad > 0) {
			saldo += cantidad;
			op = true;
		}
		
		return op;
	}
	
	/**
	 * Método para retirar una cantidad del saldo
	 * @param cantidad Cantidad a retirar
	 * @return Devuelve si se ha podido retirar la cantidad
	 * (si la cantidad a retirar es menor que el saldo disponible)
	 */
	public boolean retirar(int cantidad) {
		boolean op = false;
		
		if (cantidad < saldo) {
			saldo -= cantidad;
			op = true;
		}
		
		return op;
	}
	
	/**
	 * Añade un titular si hay menos de 3 titulares en la lista de titulares
	 * @param titular Titular a añadir
	 * @return Devuelve si se ha podido añadir el titular
	 */
	public boolean addTitular(Titular titular) {
		boolean op = false;
		
		if (numTitulares < 3) {
			titulares.add(titular);
			numTitulares++;
			op = true;
		}
		
		return op;
	}
	
	/**
	 * Elimina un titular de la lista de titulares
	 * @param titular Titular a eliminar
	 * @return Devuelve si se ha podido eliminar el titular
	 */
	public boolean deleteTitular(Titular titular) {
		boolean op = false;
		
		if (titulares.remove(titular)) {
			op = true;
			numTitulares--;
		}
		
		return op;
	}
	
}
