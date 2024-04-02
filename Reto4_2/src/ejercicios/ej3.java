package ejercicios;

import java.util.Iterator;
import java.util.Scanner;

public class ej3 {
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		
		System.out.print("Ingrese una frase: ");
		String frase = leer.nextLine();
		System.out.println();
		
		char arrayFrase [] = new char [frase.length()];
		metodoArrayChar(arrayFrase, frase);
		imprimirArray(arrayFrase);
		
	}
	
	public static void metodoArrayChar(char vector [], String frase ){
		int variableChar = 0;
		
		for (int i = 0; i < vector.length; i++) {
			vector[i]=frase.charAt(variableChar);
			variableChar++;
		}
	}
	
	
	public static void imprimirArray (char vector []){
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}
}
