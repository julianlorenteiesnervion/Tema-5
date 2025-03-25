package interfaces.ejercicio2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// Camiseta, nombre, edad, goles
		Futbolista futbolista1 = new Futbolista(5, "Julián", 18, 40);
		Futbolista futbolista2 = new Futbolista(1, "Samuel", 18, 40);
		Futbolista futbolista3 = new Futbolista(1, "José", 18, 40);
		Futbolista futbolista4 = new Futbolista(2, "Pablo", 18, 40);
		Futbolista futbolista5 = new Futbolista(7, "Antonio", 18, 40);
		
		Futbolista[] tabla = {futbolista1, futbolista2, futbolista3, futbolista4, futbolista5};
		
		System.out.println(Arrays.toString(tabla));
		
		Arrays.sort(tabla);
		
		System.out.println(Arrays.toString(tabla));
	}

}
