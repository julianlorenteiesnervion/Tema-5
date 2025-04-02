package analisis.ejercicio4;

public class Main {

	public static void main(String[] args) {

		Crud.create(new Persona("Julián", 654987123, "14/11/2006"));
		
		Crud.read();
		
		Crud.update(new Persona("Julián"), new Persona("Julián", 612456789, "15/11/2006"));
		
		Crud.read();
		
	}

}
