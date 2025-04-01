package analisis.ejercicio4;

import java.util.*;

public class Crud {
	
	private static HashSet<Contacto>listaContactos = new HashSet<>();
	
	public static boolean create(Contacto contacto) {
		return listaContactos.add(contacto);
	}
	
	public static boolean read() {
		for (Contacto contacto : listaContactos) {
			System.out.println(contacto);
		}
		
		return listaContactos.isEmpty();
	}
	
	public static boolean update(Contacto contactoAntiguo, Contacto contactoNuevo) {
		boolean op = false;
		
		if (listaContactos.remove(contactoAntiguo)) {
			listaContactos.add(contactoNuevo);
			op = true;
		}
		
		return op;
	}
	
	public static boolean remove(Contacto contacto) {
		return listaContactos.remove(contacto);
	}
}
