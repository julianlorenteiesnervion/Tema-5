package analisis.ejercicio1;

public abstract class Vehiculo {
	
	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	private boolean arrancado = false;
	private int marcha = 0;
	private int velocidad = 0;
	
	/**
	 * @param marca Fabricante del vehículo
	 * @param modelo Modelo del vehículo
	 * @param color Color del vehículo
	 * @param matricula Matrícula del vehículo
	 */
	public Vehiculo(String marca, String modelo, String color, String matricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public boolean getArrancado() {
		return arrancado;
	}

	public int getMarcha() {
		return marcha;
	}

	public int getVelocidad() {
		return velocidad;
	}
	
	public void parar() {
		arrancado = false;
	}
	
	public void arrancar() {
		arrancado = true;
	}
	
	/**
	 * Subimos la marcha si es posible
	 * @return Devuelve si ha sido posible realizar el cambio de marcha
	 */
	public boolean subirMarcha() {
		boolean op = false;
		
		if (marcha < 5) {
			marcha++;
			op = true;
		}
		
		return op;
	}
	
	/**
	 * Bajamos la marcha si es posible
	 * @return Devuelve si ha sido posible realizar el cambio de marcha
	 */
	public boolean bajarMarcha() {
		boolean op = false;
		
		if (marcha > -1) {
			marcha--;
			op = true;
		}
		
		return op;
	}
	
	/**
	 * Función para acelerar el vehículo
	 * @param velocidad Velocidad que se desea alcanzar
	 * @return Devuelve si ha sido posible realizar el cambio de velocidad
	 */
	public boolean acelerar(int velocidad) {
		boolean op = false;
		
		if (this.velocidad < velocidad && arrancado) {
			op = true;
			
			while (this.velocidad < velocidad) {
				if (this.velocidad == 0) {
					subirMarcha();
					System.out.println("Marcha: " + marcha);
				} else if (this.velocidad == 30) {
					subirMarcha();
					System.out.println("Marcha: " + marcha);
				} else if (this.velocidad == 50) {
					subirMarcha();
					System.out.println("Marcha: " + marcha);
				} else if (this.velocidad == 70) {
					subirMarcha();
					System.out.println("Marcha: " + marcha);
				} else if (this.velocidad == 100) {
					subirMarcha();
					System.out.println("Marcha: " + marcha);
				}
				
				this.velocidad++;
				System.out.println(this.velocidad);
			}
		}
		
		return op;
	}
	
	/**
	 * Función para desacelerar el vehículo
	 * @param velocidad Velocidad que se desea alcanzar
	 * @return Devuelve si ha sido posible realizar el cambio de velocidad
	 */
	public boolean desacelerar(int velocidad) {
		boolean op = false;
		
		if (this.velocidad > velocidad && arrancado) {
			op = true;
			
			while (this.velocidad > velocidad) {
				if (this.velocidad == -1) {
					bajarMarcha();
					System.out.println("Marcha: " + marcha);
				} else if (this.velocidad == 0) {
					bajarMarcha();
					System.out.println("Marcha: " + marcha);
				} else if (this.velocidad == 30) {
					bajarMarcha();
					System.out.println("Marcha: " + marcha);
				} else if (this.velocidad == 50) {
					bajarMarcha();
					System.out.println("Marcha: " + marcha);
				} else if (this.velocidad == 70) {
					bajarMarcha();
					System.out.println("Marcha: " + marcha);
				} else if (this.velocidad == 100) {
					bajarMarcha();
					System.out.println("Marcha: " + marcha);
				}
				
				this.velocidad--;
				System.out.println(this.velocidad);
			}
		}
		
		return op;
	}
	
}
