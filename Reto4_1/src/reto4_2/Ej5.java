package reto4_2;

import java.util.Iterator;
import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
		double notas [] = new double [5];
		String nombresAlumnos [] = new String [5];
		String resultadosEnPalabras[] = new String [4];
		metodoNotas(notas, nombresAlumnos, resultadosEnPalabras);
	}
	
	public static  void metodoNotas(double array[], String array2[], String array3[]) {
		Scanner leer = new Scanner(System.in);
		int contadorArray2 = 0;
		for (int i = 0; i <5; i++) {
			
			System.out.println("Ingrese el nombre del Alumno: ");
			array2[contadorArray2] = leer.nextLine();

			System.out.println("Ingrese las notas de los Alumnos del 0 al 10: ");
			double auxiliar = leer.nextDouble();
			leer.nextLine();

			if (auxiliar >= 0 && auxiliar <= 10) {
				array[contadorArray2] = auxiliar;

			} else {
				System.out.println("Nota fuera del rango...");
			}

			if (auxiliar >= 0 && auxiliar < 5) {
				array3[contadorArray2] = "Suspenso";
			} else if (auxiliar >= 5 && auxiliar < 7) {
				array3[contadorArray2] = "Bien";
			} else if (auxiliar >= 7 && auxiliar < 9) {
				array3[contadorArray2] = "Notable";
			} else if (auxiliar >= 9 && auxiliar <= 10) {
				array3[contadorArray2] = "Sobresaliente";
			}

			System.out.println("Alumno: " + array2[contadorArray2] + " " + array3[contadorArray2]);
			contadorArray2++;
		}
	}
}
