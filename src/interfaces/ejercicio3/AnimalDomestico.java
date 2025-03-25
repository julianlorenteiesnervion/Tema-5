package interfaces.ejercicio3;

public abstract class AnimalDomestico implements Animal {
	
	protected String nombre;
	protected String raza;
	protected int peso;
	protected String color;
	
	/**
	 * @param nombre Nombre del animal
	 * @param razan Raza del animal
	 * @param peso Peso del animal
	 * @param color Color del animal
	 */
	public AnimalDomestico(String nombre, String raza, int peso, String color) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.color = color;
	}

	@Override
	public void comer() {
		System.out.println(nombre + " está comiendo...");
	}

	@Override
	public void dormir() {
		System.out.println(nombre + " está durmiendo...");
	}
	
	public void vacunar() {
		System.out.println(nombre + " ha sido vacunado.");
	}
	
	public abstract boolean hacerCaso();
	
}
