package reto4_6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import reto4_4.PrimitivaModular;

public class ej1 {
	public static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Ingrese la cantidad de números");
		int longitudArray = leer.nextInt();
		int arrayInicial[] = new int[longitudArray];
		
		
		inicializarArrayUsuario(arrayInicial);
		
		System.out.print("El Array inicial es:");
		imprimirArray(arrayInicial);
		System.out.println();
		
		
		cambiarArray(arrayInicial);
		
		System.out.print("El array Ordenado es:");
		imprimirArray(arrayInicial); 


//		//Usando El .sort
//		Arrays.sort(arrayInicial);
//		
//		System.out.print("El array Ordenado es:");
//		imprimirArray(arrayInicial); 
		
	}

	
	
	static void inicializarArrayUsuario(int[] vector) {

		// Método para crear Arrays
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Ingrese un número");
			vector[i] = leer.nextInt();
		}
	}
	
	
	//Método para cambiar posiciones
	static void cambiarArray(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length; j++) {
				if(vector[i] <= vector[j]) {
					int auxiliar;
					auxiliar = vector[i];
					vector[i] = vector [j];
					vector[j] = auxiliar;
				}
			}
		}
	}
	
	//Método para imprimir Arrays
	static void imprimirArray(int [] vector) {
		
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}

}
