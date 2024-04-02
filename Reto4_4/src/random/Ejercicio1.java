package random;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
//1. Escribir un programa Java que pida por teclado el número de elementos que se van a introducir
//y posteriormente vaya pidiendo el valor de esos números enteros,
//los almacene en un array, los ordene y los muestre por pantalla.

		numeros();

	}

	static void numeros() {
		Scanner sc = new Scanner(System.in);
		int tamañoArray;

		System.out.println("Introduce el numero de elementos enteros que vas a introducir");
		tamañoArray = sc.nextInt();

		int[] numeros = new int[tamañoArray];
		int cambio;
		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Introduce el entero numero :" + (i + 1) + " de " + tamañoArray);
			numeros[i] = sc.nextInt();
			for (int j = 0; j < numeros.length; j++) {

				if (numeros[i] < numeros[j]) {
					cambio = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = cambio;
				}
			}

		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

	}

}
