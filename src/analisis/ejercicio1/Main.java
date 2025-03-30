package analisis.ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		Turismo coche = new Turismo("Tesla", "Model S", "Negro", "1234 ABC", 5, "Particular");
		
		System.out.println(coche.getArrancado() ? "Arrancado" : "No arrancado");
		
		coche.arrancar();
		System.out.println(coche.getArrancado() ? "Arrancado" : "No arrancado");

		coche.acelerar(120);
		
		coche.desacelerar(0);
		
		coche.bajarMarcha(); // Ponemos punto muerto
		
		coche.parar();
		
		System.out.println("Velocidad: " + coche.getVelocidad() + "\nMarcha: " + coche.getMarcha() + "\nEstado: " + (coche.getArrancado() ? "Arrancado" : "No arrancado"));
	}

}
