package analisis.ejercicio3;

public class Main {

	public static void main(String[] args) {

		Titular julian = new Titular("12345678A", "Julián", "Lorente Marroco", 987654321);
		
		CuentaAhorro cuentaJulian = new CuentaAhorro(9000, julian, 15, 5);
		
		System.out.println(cuentaJulian);
		
		Titular samuel = new Titular("77755533C", "Samuel", "Jiménez Rodríguez", 666222333);
		
		cuentaJulian.addTitular(samuel);
		
		System.out.println(cuentaJulian);
		
		cuentaJulian.deleteTitular(new Titular("77755533C"));
		
		System.out.println(cuentaJulian);
	}

}
