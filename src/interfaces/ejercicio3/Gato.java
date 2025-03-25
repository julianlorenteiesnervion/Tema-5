package interfaces.ejercicio3;

import java.util.Random;

public class Gato extends AnimalDomestico {

	public Gato(String nombre, String raza, int peso, String color) {
		super(nombre, raza, peso, color);
	}

	@Override
	public void hacerRuido() {
		System.out.println(nombre + " dice: ¡Miau miau!");
	}

	@Override
	public boolean hacerCaso() {
		Random random = new Random();
		
		return random.nextInt(0, 101) < 5;
	}
	
	public void toserBolaPelo() {
		System.out.println(nombre + " ha tosido una bola de pelo.");
	}

}
