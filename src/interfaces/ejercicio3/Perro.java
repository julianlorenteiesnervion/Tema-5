package interfaces.ejercicio3;

import java.util.Random;

public class Perro extends AnimalDomestico {

	public Perro(String nombre, String raza, int peso, String color) {
		super(nombre, raza, peso, color);
	}

	@Override
	public void hacerRuido() {
		System.out.println(nombre + " dice: ¡Guau guau!");
	}

	@Override
	public boolean hacerCaso() {
		Random random = new Random();
		
		return random.nextInt(0, 101) < 90;
	}
	
	public void sacarPaseo() {
		System.out.println(nombre + " ha salido de paseo.");
	}

}
