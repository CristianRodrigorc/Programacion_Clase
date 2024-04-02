package ejercicios;

import java.time.LocalDate;

public class CProfesor {
	
	private String psNombre;
	private String psApellido1;
	private LocalDate pdNacimiento;
	private int piDni;
	private int piSueldo;
	private String psTitulo;
	
	
	public CProfesor(String psNombre, String psApellido1, LocalDate pdNacimiento, int piDni, int piSueldo,
			String psTitulo) {
		super();
		this.psNombre = psNombre;
		this.psApellido1 = psApellido1;
		this.pdNacimiento = pdNacimiento;
		this.piDni = piDni;
		this.piSueldo = piSueldo;
		this.psTitulo = psTitulo;
	}
}
