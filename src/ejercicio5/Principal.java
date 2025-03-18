package ejercicio5;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String entrada;
		int opcion;
		
		int numLados;
		int lado1;
		int lado2;
		int lado3;
		
		ArrayList<Poligono>lista = new ArrayList<>();
		
		do {
			System.out.print("1. Introducir triángulo.\n"
					+ "2. Introducir rectángulo.\n"
					+ "3. Mostrar polígonos.\n"
					+ "0. Salir.\n"
					+ "Introduce una opción: ");
			opcion = reader.nextInt();
			reader.nextLine();
			
			switch (opcion) {
			case 1 -> {
				System.out.print("Nº Lados: ");
				numLados = reader.nextInt();
				reader.nextLine();
				
				System.out.print("Lado 1: ");
				lado1 = reader.nextInt();
				reader.nextLine();
				
				System.out.print("Lado 2: ");
				lado2 = reader.nextInt();
				reader.nextLine();
				
				System.out.print("Lado 3: ");
				lado3 = reader.nextInt();
				reader.nextLine();
				
				lista.add(new Triangulo(numLados, lado1, lado2, lado3));
			}
			case 2 -> {
				System.out.print("Nº Lados: ");
				numLados = reader.nextInt();
				reader.nextLine();
				
				System.out.print("Lado 1: ");
				lado1 = reader.nextInt();
				reader.nextLine();
				
				System.out.print("Lado 2: ");
				lado2 = reader.nextInt();
				reader.nextLine();
				
				lista.add(new Rectangulo(numLados, lado1, lado2));
			}
			case 3 -> {
				for (Poligono poligono : lista) {
					System.out.println(poligono);
				}
			}
			case 0 -> System.out.println("Saliendo del programa...");
			default -> System.out.println("Opción no válida.");
			}
		} while (opcion != 0);
	}

}
