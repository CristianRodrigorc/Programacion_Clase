package ejerciciosInternet;

import java.util.Iterator;
import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		int arrayEj1 [] = new int [10];
		
		pedir(arrayEj1);
		mostrar(arrayEj1);
	}
	
	public static void pedir (int array[]) {
		Scanner leer = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Ingrese el valor "+ (i+1));
			array[i] = leer.nextInt();
		}
	}
	
	public static void mostrar (int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
