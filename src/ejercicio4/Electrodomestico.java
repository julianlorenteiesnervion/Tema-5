package ejercicio4;

public class Electrodomestico {
	protected int precioBase;
	private Color color;
	private Consumo consumo;
	private int peso;
	
	private enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}
	
	private enum Consumo {
		A, B, C, D, E, F
	}

	/**
	 * @param precioBase
	 * @param color
	 * @param consumo
	 * @param peso
	 */
	public Electrodomestico(int precioBase, String color, char consumo, int peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		} else {
			this.precioBase = 100;
		}
		
		comprobarConsumoEnergetico(consumo);
		
		comprobarColor(color);
		
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
	
	/**
	 * @param letra
	 */
	private void comprobarConsumoEnergetico(char letra) {
		switch (Character.toUpperCase(letra)) {
		case 'A', 'B', 'C', 'D', 'E', 'F' -> {
			this.consumo = Consumo.valueOf(String.valueOf(Character.toUpperCase(letra)));
		}
		default -> this.consumo = Consumo.F;
		}
	}
	
	/**
	 * @param color
	 */
	private void comprobarColor(String color) {
		switch (color.toUpperCase()) {
		case "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" -> {
			this.color = Color.valueOf(color.toUpperCase());
		}
		default -> this.color = Color.BLANCO;
		}
	}
	
	/**
	 * @param consumo
	 * @param peso
	 */
	public void precioFinal() {
		
		switch (consumo) {
		case A -> precioBase += 100;
		case B -> precioBase += 80;
		case C -> precioBase += 60;
		case D -> precioBase += 50;
		case E -> precioBase += 30;
		case F -> precioBase += 10;
		}
		
		if (peso >= 0 && peso <= 19) {
			precioBase += 10;
		} else if (peso >= 20 && peso <= 49) {
			precioBase += 50;
		} else if (peso >= 50 && peso <= 79) {
			precioBase += 80;
		} else {
			precioBase += 100;
		}
	}
	
	/**
	 * @return the precioBase
	 */
	public int getPrecioBase() {
		return precioBase;
	}

	/**
	 * @param precioBase the precioBase to set
	 */
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = Color.valueOf(color);
	}

	/**
	 * @return the consumo
	 */
	public Consumo getConsumo() {
		return consumo;
	}

	/**
	 * @param consumo the consumo to set
	 */
	public void setConsumo(String consumo) {
		this.consumo = Consumo.valueOf(consumo);
	}

	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}
}
