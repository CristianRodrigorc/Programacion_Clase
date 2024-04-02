package ejercicios;

import java.util.Scanner;

public class ej2 {
	public static void main(String[] args) {
		int longArray = 26;
		char arrayABC [] = new char [longArray];
		
		metodoColocarLetras(arrayABC);
		imprimirArrays(arrayABC);
		
		metodoPrincipal(arrayABC);
		
	}
	
	
	public static void metodoColocarLetras( char vector []) {
		int letras = 65;
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (char)letras;
			letras++;
		}
	}
	
	public static void imprimirArrays(char vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print("["+(char)vector[i]+"] ");
		}
		System.out.println();
	}
	
	public static void metodoPrincipal(char vector[] ){
		Scanner leer = new Scanner(System.in);
		boolean condicional = false;
		String sumaDeLetras = "";
		int posicionLetra;
		
		do {
			System.out.print("Ingrese una posicíon de alguna vocal del 0 al 24 o un negativo para cerrar el programa: ");
			posicionLetra = leer.nextInt();
			if(posicionLetra >=0 && posicionLetra < vector.length) {
				System.out.println("La letra elegida es: "+ vector[posicionLetra]);
				sumaDeLetras += vector[posicionLetra];
			}else if (posicionLetra < 0) {
				System.out.println("Cerrando el programa...");
				condicional = !condicional;
			}else {
				System.out.println("Valor ingresadi inválido...");
			}
		} while (!condicional);
		
		System.out.print("La suma de todos los caracteres mostrados es: "+sumaDeLetras);
	}
}
