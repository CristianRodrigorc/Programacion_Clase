package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		ArrayList<Empleados> listEmpleados = new ArrayList<>();
		menu(listEmpleados);
	}

	public static void menu(ArrayList<Empleados> listEmpleados) {
		Scanner sc = new Scanner(System.in);
		boolean condition = false;
		System.out.println("******BIENVENIDO******");
		do {
			System.out.println("Ingrese 1 para añadir un empleado:");
			System.out.println("Ingrese 2 para añadir un becario:");
			System.out.println("Ingrese 3 para añadir un jefe:");
			System.out.println("Ingrese 4 para mostrar todos los empleados");
			System.out.println("Ingrese 5 Sumar sueldos por categorías");
			int menuoption = sc.nextInt();
			switch (menuoption) {
			case 1: {
				ingresarEmpleado(listEmpleados);
			}
				break;
			case 2: {
				ingresarBecario(listEmpleados);
			}
				break;
			case 3: {
				ingresarJefe(listEmpleados);
			}
				break;
			case 4: {
				imprimirEmpleados(listEmpleados);
			}
				break;
			case 5: {
				mostrarSueldosPorClase(listEmpleados);
			}
				break;
			default:
				System.out.println("******Saliendo del Menú******"); 
				condition = !condition;
			}
		} while (!condition);
	}

	private static void imprimirEmpleados(ArrayList<Empleados> listEmpleados) {
		for (Empleados empleados : listEmpleados) {
			System.out.println(empleados.toString());
		}

	}

	static void ingresarEmpleado(ArrayList<Empleados> listEmpleados) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre del empleado:");
		String nombre = sc.next();
		System.out.println("Ingrese el sueldo del empleado:");
		double sueldo = sc.nextDouble();

		Empleados empleado = new Empleados(nombre, sueldo);
		listEmpleados.add(empleado);

		System.out.println("Empleado añadido exitosamente: " + empleado.toString());
	}

	static void ingresarBecario(ArrayList<Empleados> listEmpleados) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre del empleado:");
		String nombre = sc.next();
		System.out.println("Ingrese el sueldo del empleado:");
		double sueldo = sc.nextDouble();
		System.out.println("Ingrese el tipo de contrato temporal o indefinido");
		String contrato = sc.nextLine();

		Becarios becario = new Becarios(nombre, sueldo, contrato);
		listEmpleados.add(becario);

		System.out.println("Empleado añadido exitosamente: " + becario.toString());
	}

	static void ingresarJefe(ArrayList<Empleados> listEmpleados) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre del empleado:");
		String nombre = sc.next();
		System.out.println("Ingrese el sueldo del empleado:");
		double sueldo = sc.nextDouble();
		System.out.println("Ingrese la prima");
		double prima = sc.nextDouble();

		Jefes jefe = new Jefes(nombre, sueldo, prima);
		listEmpleados.add(jefe);

		System.out.println("Empleado añadido exitosamente: " + jefe.toString());
	}

	static void mostrarSueldosPorClase(ArrayList<Empleados> listaEmpleados) {
		double sumaSueldosEmpleados = 0;
		double sumaSueldosBecarios = 0;
		double sumaSueldosJefes = 0;

		for (Empleados empleado : listaEmpleados) {
			if (empleado instanceof Empleados) {
				sumaSueldosEmpleados += empleado.getSueldo();
			} else if (empleado instanceof Becarios) {
				sumaSueldosBecarios += empleado.getSueldo();
			} else if (empleado instanceof Jefes) {
				sumaSueldosJefes += empleado.getSueldo();
			}
		}

		System.out.println("Suma de sueldos de Empleados: " + sumaSueldosEmpleados);
		System.out.println("Suma de sueldos de Becarios: " + sumaSueldosBecarios);
		System.out.println("Suma de sueldos de Jefes: " + sumaSueldosJefes);
	}
}
