package ejercicios;

public class Empleados {
	private String nombre;
	private double sueldo;
	
	
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	
	public Empleados (String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	
}
