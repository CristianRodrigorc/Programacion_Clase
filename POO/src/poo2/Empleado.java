package poo2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado implements Comparable {
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private final int id;
	private static int idSiguiente = 1;
	
	public Empleado(String nombre, double sueldo, int anno, int mes, int dia) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(anno, mes, dia);
		this.altaContrato = calendario.getTime();
		this.id = idSiguiente++;
	}
	
	public Empleado(String nombre) {
		this(nombre, 1000, 2000, 0, 1);
	}
	
	//public abstract String getDescripcion();
	
	public void subeSueldo(double porcentaje) {
		double aumento = getSueldo() * porcentaje / 100;
		setSueldo(getSueldo()+aumento);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public Date getAltaContrato() {
		return altaContrato;
	}
	public void setAltaContrato(Date altaContrato) {
		this.altaContrato = altaContrato;
	}
	
	@Override
	public String toString() {
		return "Empleado [Nombre=" + getNombre() + ", Sueldo=" + getSueldo() + ", AltaContrato="
				+ getAltaContrato() + ", Id=" + id + "]";
	}

	@Override
	public int compareTo(Object o) {
		Empleado otroEmpleado = (Empleado) o;
		if(this.sueldo < otroEmpleado.sueldo) {
			return 1;
		}
		if(this.sueldo > otroEmpleado.sueldo) {
			return -1;
		}
		return 0;
	}

	public String tomarDecisiones(String decision) {
		return "Se toma la decisión: " + decision;
	}
	
	
	
	
}
