package ejercicio5;

public class Triangulo extends Poligono {
	private double lado1 = 1;
	private double lado2 = 1;
	private double lado3 = 1;
	
	/**
	 * @param numeroLados
	 */
	public Triangulo(int numeroLados) {
		super(numeroLados);
	}

	/**
	 * @param numeroLados
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {
		super(numeroLados);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
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

	/**
	 * @return the lado3
	 */
	public double getLado3() {
		return lado3;
	}

	/**
	 * @param lado3 the lado3 to set
	 */
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	@Override
	public double area() {
		// Calcular el semiperímetro
        double s = (lado1 + lado2 + lado3) / 2;

        // Aplicar la fórmula de Herón
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
	}
	
	@Override
	public String toString() {
		return super.toString() + "Triángulo\tLado 1: " + lado1 + "\tLado 2: " + lado2 + "\tLado 3: " + lado3 + "\tÁrea: " + area();
	}
}
