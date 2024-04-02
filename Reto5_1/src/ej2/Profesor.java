package ej2;

public class Profesor {
	private String nombre = "";
	private int edad = 0;
	private int añosConsolidados = 0;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getAñosConsolidados() {
		return añosConsolidados;
	}
	public void setAñosConsolidados(int añosConsolidados) {
		this.añosConsolidados = añosConsolidados;
	}
	
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", edad=" + edad + ", añosConsolidados=" + añosConsolidados + "]";
	}
	
	public double obtenerSalarioBase(int añosConsolidados) {
		double salario = 1100+(añosConsolidados*50);
		return salario;
	}
}
