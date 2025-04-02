package analisis.ejercicio3;

public class Main {

	public static void main(String[] args) {

		// Cuenta ahorro
		Titular julian = new Titular("12345678A", "Julián", "Lorente Marroco", 987654321);
		
		CuentaAhorro cuentaJulian = new CuentaAhorro(9000, julian, 15, 5);
		
		System.out.println(cuentaJulian);
		
		Titular samuel = new Titular("77755533C", "Samuel", "Jiménez Rodríguez", 666222333);
		
		cuentaJulian.addTitular(samuel);
		
		System.out.println(cuentaJulian);
		
		cuentaJulian.deleteTitular(new Titular("77755533C"));
		
		System.out.println(cuentaJulian);
		
		System.out.println(cuentaJulian.saldoInteres()); // Obtenemos el saldo con el interés
		cuentaJulian.restarCuota(); // Le restamos la cuota
		System.out.println(cuentaJulian); // Podemos ver que se ha restado correctamente
		
		// Cuenta corriente
		Titular joseManuel = new Titular("11133355F", "José Manuel", "Maya Hidalgo", 678222000);
		
		CuentaCorriente cuentaMaya = new CuentaCorriente(5000, joseManuel, 3);
		
		System.out.println(cuentaMaya);
		
		cuentaMaya.addTransaccion(new Transaccion(02, 04, 2025, "Compra en Mercadona.", -50));
		
		System.out.println(cuentaMaya);
		
		cuentaMaya.addTransaccion(new Transaccion(02, 04, 2025, "Ingreso del salario mensual.", 2500));
		
		System.out.println(cuentaMaya);
	}

}
