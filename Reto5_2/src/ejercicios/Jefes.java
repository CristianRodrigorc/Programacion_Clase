package ejercicios;

public class Jefes extends Empleados {

	private double prima;
	
	public Jefes(String nombre, double sueldo, double prima) {
		super(nombre, sueldo);
		this.prima = prima;
	}

	public double getPrima() {
		return prima;
	}

	public void setPrima(double prima) {
		this.prima = prima;
	}

	@Override
	public String toString() {
		return "Jefes [prima=" + prima + ", getSueldo()=" + getSueldo() + "]";
	}
	
	

}
