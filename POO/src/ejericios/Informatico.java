package ejericios;

public class Informatico extends Persona {
	
	String especialidad;
	
	public Informatico(String nombre, String apellido, int identificacion, String especialidad) {
		super(nombre, apellido, identificacion);
		this.especialidad = especialidad;
	}
}
