package ejercicios;

import java.time.LocalDate;

public class CAlumnoMain1 {
	public static void main(String[] args) {

		LocalDate fechaNacimientoProfesor1 = LocalDate.of(1980, 01, 01);
		LocalDate fechaNacimientoProfesor2 = LocalDate.of(1981, 02, 02);
		LocalDate fechaNacimientoProfesor3 = LocalDate.of(1982, 03, 03);
		
		
		LocalDate fechaNacimientoAlumno1 = LocalDate.of(2001, 12, 03);
		LocalDate fechaNacimientoAlumno2 = LocalDate.of(2000, 11, 04);
		LocalDate fechaNacimientoAlumno3 = LocalDate.of(1999, 10, 05);
		
		


		CProfesor profesor1 = new CProfesor("Manuel", "Santana", fechaNacimientoProfesor1, 4567, 1000, "Informática");
		CProfesor profesor2 = new CProfesor("Carolina", "Ruiz", fechaNacimientoProfesor2, 5678, 2000, "Informática");
		CProfesor profesor3 = new CProfesor("Javier", "Rodríguez",fechaNacimientoProfesor3, 6789, 3000, "CiberSeguridad");

		CAsignatura asignatura1 = new CAsignatura(11, "Java", profesor3, 8);
		CAsignatura asignatura2 = new CAsignatura(22, "Marcas", profesor2, 4);
		CAsignatura asignatura3 = new CAsignatura(33, "Entornos", profesor1, 3);
		
		CAsignatura asignaturaAlumno1 [] = {new CAsignatura(11, "Java", profesor3, 8),new CAsignatura(22, "Marcas", profesor2, 4)};
		CAsignatura asignaturaAlumno2 [] = {new CAsignatura(11, "Java", profesor3, 8),new CAsignatura(22, "Marcas", profesor2, 4)};
		CAsignatura asignaturaAlumno3 [] = {new CAsignatura(11, "Java", profesor3, 8),new CAsignatura(22, "Marcas", profesor2, 4), new CAsignatura(33, "Entornos", profesor1, 3)};
		
		int notasAlumno1 [] = { 0, 0};
		int notasAlumno2 [] = { 1, 1, 7};
		int notasAlumno3 [] = { 5};
		
		CAlumno alumno1 = new CAlumno("Pedro", "Santana", fechaNacimientoAlumno1, 1234, asignaturaAlumno1, notasAlumno1);
		CAlumno alumno2 = new CAlumno("María", "Ruiz", fechaNacimientoAlumno2, 2345, asignaturaAlumno2, notasAlumno2);
		CAlumno alumno3 = new CAlumno("Esther ", "Rodríguez", fechaNacimientoAlumno3, 3456, asignaturaAlumno3, notasAlumno3);
		
		
		
		System.out.println(alumno1.toString());
		
		
	}
}
