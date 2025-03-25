package interfaces.ejercicio1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Socio socio1 = new Socio(1, "Julián", 18);
		Socio socio2 = new Socio(2, "José", 19);
		Socio socio3 = new Socio(4, "Samuel", 18);
		
		System.out.println(socio1.compareTo(socio2));
		System.out.println(socio1.compareTo(socio1));
		System.out.println(socio3.compareTo(socio1));
		
		Socio[] socios = {socio1, socio3, socio2};
		
		System.out.println(Arrays.toString(socios));
		
		Arrays.sort(socios);
		
		System.out.println(Arrays.toString(socios));
	}

}
