package ejericios;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleados {
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int  idSiguiente =1; // conteo para empleados automatica

	public Empleados(String nombre, double sueldo, int año, int mes, int dia) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
		GregorianCalendar calendario =  new GregorianCalendar(año, mes, dia); //importacion calendario gregoriano
		this.altaContrato = calendario.getTime();
		this.id = idSiguiente++;
	}
	public Empleados(String nombre) {// PUEDO CREAR UN CONSTRUCTOR CON EL MISMO NOMBRE Y PASARLE EN EN EL THIS, LOS DATOS O ATRIBUTOS QUE QUIERO USAR Y TODOS LOS OBJETOS QUE CREE LOS ESTABLECERA CON LOS DATOS PASADOS
		this(nombre,1000,2000,07,11);// en este constructor cuando creo en el main cosas me pone predefinijos estos valores
	
	}

	
	public void subeSueldo(double porcentaje) {
		double aumento = getSueldo() * porcentaje / 100; //metodo para aumentar el sueldo, donde establezco uno nuevo y luego guardo en el sueldo
		setSueldo(getSueldo() +aumento);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() { //sueldo que tengo
		return sueldo;
	}

	public void setSueldo(double sueldo) { // establece un sueldo nuevo
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
		return "Empleado [id= " + id + ", Nombre= " + getNombre() + ", Sueldo= " + getSueldo()
				+ ", AltaContrato= " + getAltaContrato() + "]";
	}

}
