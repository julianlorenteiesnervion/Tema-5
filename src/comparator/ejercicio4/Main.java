package comparator.ejercicio4;

public class Main {

	public static void main(String[] args) {

		Libro libro = new Libro(1, "Caperucita roja", "Julián", "Anaya");
		
		Revista revista = new Revista(2, "Sálvame", 4, 2025);
		
		DVD dvd = new DVD(3, "Geometry Dash", "Robtop", 2023, "Pelicula");
		
		System.out.println(libro);
		
		System.out.println(revista);
		
		System.out.println(dvd);
	}

}
