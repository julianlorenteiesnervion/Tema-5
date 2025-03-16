package ejercicio4;

public class Electrodomestico {
	protected int precioBase;
	protected Color color;
	protected Consumo consumo;
	protected int peso;
	
	protected enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}
	
	protected enum Consumo {
		A, B, C, D, E, F
	}

	/**
	 * @param precioBase
	 * @param color
	 * @param consumo
	 * @param peso
	 */
	public Electrodomestico(int precioBase, String color, String consumo, int peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		} else {
			this.precioBase = 100;
		}
		
		switch (color.toUpperCase()) {
		case "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" -> {
			this.color = Color.valueOf(color.toUpperCase());
		}
		default -> this.color = Color.BLANCO;
		}
		
		switch (consumo.toUpperCase()) {
		case "A", "B", "C", "D", "E", "F" -> {
			this.consumo = Consumo.valueOf(consumo.toUpperCase());
		}
		default -> this.consumo = Consumo.F;
		}
		
		if (peso > 0) {
			this.peso = peso;
		} else {
			this.peso = 5;
		}
	}

	/**
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomestico(int precioBase, int peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		} else {
			this.precioBase = 100;
		}
		
		if (peso > 0) {
			this.peso = peso;
		} else {
			this.peso = 5;
		}
	}
}
