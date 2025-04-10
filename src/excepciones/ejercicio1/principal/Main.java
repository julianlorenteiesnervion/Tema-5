package excepciones.ejercicio1.principal;

import excepciones.ejercicio1.clases.Hora;
import excepciones.ejercicio1.excepciones.NegativeHourException;
import excepciones.ejercicio1.excepciones.NegativeMinuteException;

public class Main {

	public static void main(String[] args) {
		
		Hora hora = null;
		
		try {
			hora = new Hora(-2, 15);
		} catch (NegativeHourException e) {
			System.out.println(e);
		} catch (NegativeMinuteException e) {
			System.out.println(e);
		}
		
		try {
			hora = new Hora(2, -15);
		} catch (NegativeHourException e) {
			System.out.println(e);
		} catch (NegativeMinuteException e) {
			System.out.println(e);
		}
		
		try {
			hora = new Hora(2, 15);
			System.out.println("Se ha creado el objeto.");
		} catch (NegativeHourException e) {
			System.out.println(e);
		} catch (NegativeMinuteException e) {
			System.out.println(e);
		}
		
		// No se puede ejecutar
		try {
			hora.setHora(-3);
		} catch (NegativeHourException e) {
			System.out.println(e);
		}
		
		// Sí se puede ejecutar
		try {
			hora.setHora(3);
			System.out.println("Hora actualizada.");
		} catch (NegativeHourException e) {
			System.out.println(e);
		}

	}

}
