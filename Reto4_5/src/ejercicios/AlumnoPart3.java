package ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class AlumnoPart3 {
	static Scanner leer = new Scanner(System.in);

	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private double notas[] = new double[3];

	// Constructor de 3 parámetros
	public AlumnoPart3(String nombre, String apellido, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.notas = new double[3]; // Se inicializa el array de notas con tamaño 3
	}

	public AlumnoPart3() {
		// Valores en 0
		this.nombre = "";
		this.apellido = "";
		this.fechaNacimiento = LocalDate.now(); // Fecha de nacimiento en la fecha actual
		this.notas = new double[3];
	}

	// Definir un formato para la fecha
	public static DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	// Métodos getter y setter para acceder a los atributos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	// Método para calcular la media de las notas
	public double calcularMedia() {
		double suma = 0;
		for (double nota : notas) {
			suma += nota;
		}
		return suma / notas.length;
	}

	// Método para imprimir Alumno
	public void imprimirInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Fecha de nacimiento: " + fechaNacimiento);
		System.out.println("Notas: " + Arrays.toString(notas));
	}

	// Método toString
	@Override
	public String toString() {
		return "Alumno{" + "nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' + ", fechaNacimiento="
				+ fechaNacimiento + ", notas=" + Arrays.toString(notas) + '}';
	}

	// Métodos para establecer las notas de inglés, francés y alemán
	public void setNotaIngles(double notaIngles) {
		notas[0] = notaIngles;
	}

	public void setNotaFrances(double notaFrances) {
		notas[1] = notaFrances;
	}

	public void setNotaAleman(double notaAleman) {
		notas[2] = notaAleman;
	}

	public static void main(String[] args) {
		AlumnoPart3 grupo[] = new AlumnoPart3[5];
		AlumnoPart3 alumno1 = new AlumnoPart3();
		AlumnoPart3 alumno2 = new AlumnoPart3();
		AlumnoPart3 alumno3 = new AlumnoPart3();
		AlumnoPart3 alumno4 = new AlumnoPart3();
		AlumnoPart3 alumno5 = new AlumnoPart3();

		grupo[0] = alumno1;
		grupo[1] = alumno2;
		grupo[2] = alumno3;
		grupo[3] = alumno4;
		grupo[4] = alumno5;
		
		ingresarDatos(grupo);
		printArray(grupo);
	}

	public static void ingresarDatos(AlumnoPart3 vector[]) {

		for (int i = 0; i < vector.length; i++) {
			System.out.println("Ingrese el Nombre del Alumno " + (i + 1));
			vector[i].nombre = leer.nextLine();

			System.out.println("Ingrse el Apellido del Alumno " + (i + 1));
			vector[i].apellido = leer.nextLine();
			
			// Pedir al usuario que ingrese una fecha
			System.out.println("Ingrese la Fecha de Nacimiento del alumno " + (i + 1) + " en formato Año-Mes-Día:");
			String auxFecha = leer.nextLine();
			vector[i].fechaNacimiento = LocalDate.parse(auxFecha, formatoFecha);
			
			//Pedir notas al usuario
			System.out.println("Ingrese la nota de Inglés:");
			double auxNotaIng =leer.nextDouble();
			vector[i].setNotaIngles(auxNotaIng);
			
			System.out.println("Ingrese la nota de Frances:");
			double auxNotaFran = leer.nextDouble();
			vector[i].setNotaFrances(auxNotaFran);
			
			System.out.println("Ingrese la nota de Alemán:");
			double auxNotaAle = leer.nextDouble();
			vector[i].setNotaAleman(auxNotaAle);
			
			leer.nextLine();
			}
		}
	
	
	public static void printArray(AlumnoPart3 vector []) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i].toString());
		}
	}

}