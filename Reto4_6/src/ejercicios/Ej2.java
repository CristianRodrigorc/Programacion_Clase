package ejercicios;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ej2 {
	public Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		int arrayNumRandom[] = new int[20];
		generarRandom(arrayNumRandom);
		imprimirArrays(arrayNumRandom);
		comprobarNumRepetidos(arrayNumRandom);
		System.out.println(cantidadPrimos(arrayNumRandom));
		int arrayPrimos [] = ponerArrayPrimos(arrayNumRandom);
		imprimirArrays(arrayPrimos);
		
	}

	public static void generarRandom(int vector[]) {
		Random random = new Random();
		for (int i = 0; i < vector.length; i++) {
			int auxiliar = 0;
			boolean repetido = true;
			while (repetido) {
				auxiliar = random.nextInt(100) + 100;
				repetido = false;
				for (int j = 0; j < i; j++) {
					if (auxiliar == vector[j]) {
						repetido = true;
						break;
					}
				}
			}
			vector[i] = auxiliar;
		}
	}

//	public static boolean busquedaNumRandom(int vector[],int auxiliar, int i ){
//		
//		for (int j = 0; j < i; j++) {
//			if(auxiliar == vector[j]) {
//				return true;
//			}
//		}
//		return false;
//		
//	}

	static void imprimirArrays(int vector[]) {

		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}
		System.out.println();
	}

	public static void comprobarNumRepetidos(int vector[]) {
		for (int i = 1; i < vector.length; i++) {
			for (int j = 0; j < i; j++) {
				if (vector[i] == vector[j]) {
					System.out.println("Se repiten en las pociones: " + (j + 1) + " " + (i + 1));
				}
			}
		}
	}

	public static boolean comprobarPrimos(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			for (int j = 2; j < Math.sqrt(vector[i]); j++) {
				if (vector[i] % j == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static int cantidadPrimos(int vector[]) {
		int contador = 0;
		boolean auxiliar = true;
		for (int i = 0; i < vector.length; i++) {
			for (int j = 2; j < Math.sqrt(vector[i]); j++) {
				if (vector[i] % j == 0) {
					auxiliar = false;
				}
			}
			if (auxiliar == true) {
				contador++;
			}
		}
		return contador;
	}

	public static int[] ponerArrayPrimos(int vectorInicial[]) {
		int [] arrayPrimos = new int [cantidadPrimos(vectorInicial)];
		int indicePrimo = 0;
		
		for (int i = 0; i < vectorInicial.length; i++) {
			if(comprobarPrimos(vectorInicial)){
				arrayPrimos[indicePrimo]=vectorInicial[i];
				indicePrimo++;
			}
		}
		return arrayPrimos;
	}

}
