package comparator.ejercicio2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Socio socio1 = new Socio(1, "Julián", 18);
		Socio socio2 = new Socio(2, "Samuel", 19);
		Socio socio3 = new Socio(3, "José", 23);
		Socio socio4 = new Socio(4, "Pablo", 16);
		
		Socio[] lista = {socio1, socio2, socio3, socio4};
		
		Arrays.sort(lista, new ComparadorNombre());
		
		System.out.println("Por nombre: ");
		System.out.println(Arrays.toString(lista));
		
		Arrays.sort(lista, new ComparadorEdad());
		
		System.out.println("Por edad: ");
		System.out.println(Arrays.toString(lista));
	}

}
