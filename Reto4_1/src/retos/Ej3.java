package retos;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int[] numeros = { 12, 15, 13, 10, 8, 9, 13, 14 };

		System.out.print("Indicar el primer índice a cambiar: ");
		int indice1 = leer.nextInt();
		
		System.out.print("Indicar el segundo índice a cambiar: ");
		int indice2 = leer.nextInt();
		
		
		if(indice1 >=0 && indice1< numeros.length && indice2>=0 && indice2 < numeros.length) {
			alternar(numeros, indice1, indice2);
			
			//Mostrar el Array alternado
			for (int i = 0; i < numeros.length; i++) {
				System.out.println(+numeros[i]);
			}
		}else {
			System.out.println("Los índices están fuera del rango del Array");
		}
		
	}
	
	public static void alternar(int [] array, int indice1, int indice2) {
		int temporal = array [indice1];
		array[indice1] = array[indice2];
		array[indice2] = temporal;
	}
}
