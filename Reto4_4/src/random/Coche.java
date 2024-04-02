package random;

import java.time.LocalDate;
import java.util.Scanner;



//El proyecto consiste en desarrollar un programa que getione los coches de una empresa de alquileres
//Desarrollar la clase Coche que cumpla con los siguientes requisitos:
//	atributos: Marca, modelo y matrìcula (cadenas de caracteres), disponible (booleano), fecha Disponible local date
//	constructor con los parámetros marca, modelo y matrícula. Un coche inicialmente debe estar disponible y la fecha disponible a null.
//	
//	metodos:
//		alquilarCoche():
//			recibe como paràmetro el coche a alquialr y el nùmero de dias que se desea alquilar 
//			se debe controlar si el coche està disponible.
//			Al alquilar un coche, deja de estar disponible y la fecha de disponibilidad es la fecha de hoy a màs los días en los que va a estar alquilados.
//			Al alquilar un coche deja de estar disponible y la fecha de disponibilidad es la fecha de hoy mas los dias en los que va a estar alquilado
//			
//			devolverCoche():
//				recibe como paràmetro el coche a devolver
//				se debe controlar que el coche està alquilado
//				Al devolver un coche pasa  a disponible y la fecha de disponibilidad a null
//				
//				toString()
//				
//				
//				Desarrollar la clase principal que contenga los siguientes métodos:
//					menu() visualiza el siguiente menu y devuelve la opción que el usuario ha seleccionado.
//	
//	Menu alquiler coches
//	1.- Alquilar un coche
//	2.- Devolver un coche
//	0.- Salir
//	
//	main:
//	Define tres coches
//	Visualiza el menú
//	En las opciones Alquilar y devolver coche, pide la matrícula del coche con el que se va a operar
//	Llama a los métodos de la clase Coche según convenga.

public class Coche {
	private String marca;
	private String modelo;
	private String matricula;
	private boolean disponible;
	private LocalDate fechaDisponible;

	public Coche(String marca, String modelo, String matricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.disponible = true;
		this.fechaDisponible = null;
	}

	public void alquilarCoche(int dias) {
		if (disponible) {
			disponible = false;
			fechaDisponible = LocalDate.now().plusDays(dias);
			System.out.println("Coche alquilado por " + dias + " días. Disponible hasta: " + fechaDisponible);
		} else {
			System.out.println("El coche no está disponible para alquilar.");
		}
	}

	public void devolverCoche() {
		if (!disponible) {
			disponible = true;
			fechaDisponible = null;
			System.out.println("Coche devuelto. Disponible ahora.");
		} else {
			System.out.println("El coche ya está disponible.");
		}
	}

	@Override
	public String toString() {
		return "Coche: " + marca + " " + modelo + " (" + matricula + ")";
	}

	public boolean isDisponible() {
		return disponible;
	}

	public LocalDate getFechaDisponible() {
		return fechaDisponible;
	}

	public String getMatricula() {
		return matricula;
	}

	public static void main(String[] args) {
		Coche coche1 = new Coche("Toyota", "Hilux", "123ABC");
		Coche coche2 = new Coche("Nissan", "Xtrial", "456DEF");
		Coche coche3 = new Coche("Hyundai", "Tuccson", "789GHI");

		menu(coche1, coche2, coche3);
	}

	public static void menu(Coche... coches) {
		Scanner leer = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("Menu alquiler coches");
			System.out.println("1.- Alquilar un coche");
			System.out.println("2.- Devolver un coche");
			System.out.println("0.- Salir");
			System.out.print("Seleccione una opción: ");
			opcion = leer.nextInt();

			switch (opcion) {
			case 1:
				alquilarCoche(coches);
				break;
			case 2:
				devolverCoche(coches);
				break;
			case 0:
				System.out.println("Saliendo del programa.");
				break;
			default:
				System.out.println("Opción no válida. Inténtelo de nuevo.");
			}

		} while (opcion != 0);
	}

	public static void alquilarCoche(Coche... coches) {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese la matrícula del coche que desea alquilar: ");
		String matricula = leer.next();

		for (Coche coche : coches) {
			if (coche.getMatricula().equals(matricula)) {
				System.out.print("Ingrese el número de días para alquilar: ");
				int dias = leer.nextInt();
				coche.alquilarCoche(dias);
				return;
			}
		}

		System.out.println("No se encontró un coche con esa matrícula.");
	}

	public static void devolverCoche(Coche... coches) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese la matrícula del coche que desea devolver: ");
		String matricula = scanner.next();

		for (Coche coche : coches) {
			if (coche.getMatricula().equals(matricula)) {
				coche.devolverCoche();
				return;
			}
		}

		System.out.println("No se encontró un coche con esa matrícula.");
	}
}

