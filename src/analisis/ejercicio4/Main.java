package analisis.ejercicio4;

public class Main {

	public static void main(String[] args) {

		Crud.create(new Persona("Julián", 654987123, "14/11/2006"));
		
		Crud.read();
		
		Crud.update(new Persona("Julián"), new Persona("Julián", 612456789, "15/11/2006"));
		
		Crud.read();
		
		Crud.create(new Contacto("pepe", 123));
		Crud.read();
		Crud.update(new Contacto("pepe"), new Contacto("pepe", 456));
		Crud.read();
	}

}
