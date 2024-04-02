package control;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Empresa {
	static Scanner leer = new Scanner(System.in);

	private String nombre;
	private int numeroEmpleados;
	private float beneficios;

	public Empresa(String nombre, int numeroEmpleados, float beneficios) {
		this.nombre = nombre;
		this.numeroEmpleados = numeroEmpleados;
		this.beneficios = beneficios;
	}

	public Empresa(String nextLine) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Empresa [" + "nombre=" + nombre + ", numeroEmpleados=" + numeroEmpleados + ", beneficios=" + beneficios
				+ "]";
	}

	// Método que pide el número de empresas
	public static int numeroEmpresas() {
		int auxiliar = 0;
		System.out.print("Ingrese el número de empresas: ");
		auxiliar = leer.nextInt();
		return auxiliar;

	}

	// Método que imprime usando el "toString" mediante recorre el bucle
	public static void imprimirEmpresas(Empresa vector[]) {

		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i].toString());
		}
	}

	// Método que rrecorre el array de Objetos y va pidiendo los datos de cada
	// Objeto
	public static Empresa[] llenarEmpresa(Empresa vector[]) {

		for (int i = 0; i < vector.length; i++) {
			leer.nextLine();
			System.out.println("Ingrese el nombrecódigo de la empresa Nº" + (i + 1));
			vector[i] = new Empresa(leer.nextLine());
			System.out.println("Ingrese el nombre de la empresa Nº" + (i + 1));
			vector[i].nombre = leer.nextLine();
			System.out.println("Ingrese el número de empleados de la empresa Nº" + (i + 1));
			vector[i].numeroEmpleados = leer.nextInt();
			System.out.println("Ingrese el beneficio de la primera empresa Nº" + (i + 1));
			vector[i].beneficios = leer.nextFloat();
		}
		return vector;
	}

	// Método que recorre el arrayObjeto sumas los .empleados y los divide entre el
	public static void promedioEmpleados(Empresa vector[]) {
		int auxiliar = 0;
		int resultado = 0;
		for (int i = 0; i < vector.length; i++) {
			auxiliar += vector[i].numeroEmpleados;
		}

		resultado = auxiliar / vector.length;
		System.out.print("El promedio de todos los empleados es: " + auxiliar);
		System.out.println();
	}

	// Método para hallar el valor del beneficio Máximo. Identificando el valor
	// Máximo
	// para posteriormente imprimir unicamente las empresas que tengan dicho valor
	public static void beneficioMax(Empresa vector[]) {
		float auxiliar = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i].beneficios > auxiliar) {
				auxiliar = vector[i].beneficios;
			}
		}
		System.out.println("El beneficio Máximo es: " + auxiliar);
		System.out.println("Las empresas que tienen el mayor beneficio son: ");

		for (int i = 0; i < vector.length; i++) {
			if (vector[i].beneficios == auxiliar) {
				System.out.println(vector[i].nombre);
			}
		}
	}

	public static void main(String[] args) {
		int numeroEmpresa = numeroEmpresas();
		Empresa arrayEmpresas[] = new Empresa[numeroEmpresa];
		arrayEmpresas = llenarEmpresa(arrayEmpresas);
		imprimirEmpresas(arrayEmpresas);
		promedioEmpleados(arrayEmpresas);
		beneficioMax(arrayEmpresas);
	}
}
