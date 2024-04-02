package retos;

import java.util.Iterator;
import java.util.Scanner;

public class Ej0 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
//		//Array de Enteros
		int cadenaDeEnteros[] = new int[6];
//		
//		//Introducir los valores del Array
		for (int i = 0; i < cadenaDeEnteros.length; i++) {
			System.out.println("Introducir el valor: ");
			cadenaDeEnteros[i] = leer.nextInt();
		}
//		
//		//Mostrar los valores del Array
		for (int i = 0; i < cadenaDeEnteros.length; i++) {
			System.out.println("El valor N° " + (i + 1) + " es: " + cadenaDeEnteros[i]);
		}
		
		
		// Array de Cadena de caracteres
		String cadenaCaracteres[] = new String[6];

		// Introducir las cadenas de caracteres
		for (int i = 0; i < cadenaCaracteres.length; i++) {
			System.out.println("Introducir la cadena de caracteres: ");
			cadenaCaracteres[i] = leer.nextLine();
		}
		// Mostrar las cadenas de caracteres
		for (int j = 0; j < cadenaCaracteres.length; j++) {
			System.out.println("El valor N° " + (j + 1) + " es: " + cadenaCaracteres[j]);
		}
		
		//Array de char
		char cadenaChar [] = new char [6];
		
		//Introducir los valores Char
		for (int i = 0; i < cadenaChar.length; i++) {
			System.out.println("Introducir el valor: ");
			cadenaChar [i] = leer.next().charAt(0);
		}
		
		//Mostrar los valores
		for (int k = 0; k < cadenaChar.length; k++) {
			System.out.println("El valor N° " + (k + 1) + " es: " + cadenaChar[k]);
		}
			
	}
}
