package ejercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Ej1 {
	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		int cantidad = cantidadNum();
		int arrayNum[] = new int[cantidad];
		crearArray(arrayNum, cantidad);
		
		System.out.print("El array original es: ");
		imprimirArrays(arrayNum);
		ordenarArray(arrayNum);
		
		System.out.print("El array ordenado es: ");
		imprimirArrays(arrayNum);
	}

	static int cantidadNum() {
		System.out.println("Ingrese la cantidad de números que declarará: ");
		int cantidad = leer.nextInt();
		return cantidad;
	}

	static void crearArray(int vector[], int cantidad) {

		for (int i = 0; i < vector.length; i++) {
			System.out.print("Ingrese el " + (i + 1) + " número: ");
			vector[i] = leer.nextInt();
		}
	}

	static void imprimirArrays(int vector[]) {

		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}
		System.out.println();
	}

	static void ordenarArray(int vector[]) {
		int auxiliar = 0;
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length; j++) {
				if (vector[i]<vector[j]){
					auxiliar = vector[j];
					vector[j] = vector[i];
					vector[i] = auxiliar;
				}
			}
		}
				}

}
