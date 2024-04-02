package interfaces;

public class Rectangulo implements Forma{

	private double base;
	private double altura;
	
	
	
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double calcularArea() {
		return base * altura;
	}

	public double calcularPerimetro() {
		return 2*(base + altura);
	}

}
