package ejercicio4;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Electrodomestico>lista = new ArrayList<>();
		
		int sumaLavadoras = 0;
		int sumaTelevisores = 0;
		int sumaElectrodomesticos = 0;
		
		lista.add(new Lavadora(200, 30));
		lista.add(new Lavadora(350, 50));
		lista.add(new Television(500, 15));
		lista.add(new Television(900, 20));
		
		System.out.println(lista);
		
		for (Electrodomestico electrodomestico : lista) {
			electrodomestico.precioFinal();
		}
		
		System.out.println(lista);
		
		for (Electrodomestico electrodomestico : lista) {
			if (electrodomestico instanceof Lavadora) {
				sumaLavadoras += electrodomestico.getPrecioBase();
			} else if (electrodomestico instanceof Television) {
				sumaTelevisores += electrodomestico.getPrecioBase();
			}
			
			sumaElectrodomesticos += electrodomestico.getPrecioBase();
		}
		
		System.out.println("Total lavadoras: " + sumaLavadoras + "\nTotal televisores: " + sumaTelevisores + "\nTotal electrodomesticos: " + sumaElectrodomesticos);
	}

}
