package analisis.ejercicio4;

import java.util.*;

public class Crud {
	
	private static HashSet<Contacto>listaContactos = new HashSet<>();
	
	public boolean create(Contacto contacto) {
		return listaContactos.add(contacto);
	}
	
	public boolean read() {
		for (Contacto contacto : listaContactos) {
			System.out.println(contacto);
		}
		
		return listaContactos.isEmpty();
	}
	
	public boolean update(Contacto contactoAntiguo, Contacto contactoNuevo) {
		boolean op = false;
		
		if (listaContactos.remove(contactoAntiguo)) {
			listaContactos.add(contactoNuevo);
			op = true;
		}
		
		return op;
	}
	
	public boolean remove(Contacto contacto) {
		return listaContactos.remove(contacto);
	}
}
