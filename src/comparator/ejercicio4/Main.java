package comparator.ejercicio4;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Libro libro = new Libro(1, "Caperucita roja", "Julián", "Anaya");
		
		Revista revista = new Revista(2, "Sálvame", 4, 2025);
		
		DVD dvd = new DVD(3, "Geometry Dash", "Robtop", 2023, "Pelicula");
		
		// Pruebas comparable / comparator
		List<Ficha>lista = new ArrayList<Ficha>();
		
		lista.add(revista);
		lista.add(libro);
		lista.add(dvd);
		
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println("Ordenada");
		System.out.println(lista);
		Collections.sort(lista, new ComparadorAlfabetico());
		System.out.println("Alfabéticamente");
		System.out.println(lista);
		
		// Por ID con expresión lambda
		System.out.println("Lambda");
		Collections.sort(lista, (id1, id2) -> id1.compareTo(id2));
		System.out.println(lista);
	}

}
