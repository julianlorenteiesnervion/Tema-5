package ejercicio5;

public class Rectangulo extends Poligono {
	private double lado1 = 1;
	private double lado2 = 1;
	
	/**
	 * @param numeroLados
	 */
	public Rectangulo(int numeroLados) {
		super(numeroLados);
	}

	/**
	 * @param numeroLados
	 * @param lado1
	 * @param lado2
	 */
	public Rectangulo(int numeroLados, double lado1, double lado2) {
		super(numeroLados);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	/**
	 * @return the lado1
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * @param lado1 the lado1 to set
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	/**
	 * @return the lado2
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * @param lado2 the lado2 to set
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	@Override
	public double area() {
		return lado1 * lado2;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Rectángulo\tLado 1: " + lado1 + "\tLado 2: " + lado2 + "\tÁrea: " + area();
	}
}
