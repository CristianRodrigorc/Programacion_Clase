package reto4_1;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int[] numeros = {12, 15, 13, 10, 8, 9, 13, 14};
		
		System.out.print("Introducir un valor: ");
		int variable = leer.nextInt();
		
		boolean condicional = false;
		
		for (int i = 0; i < numeros.length; i++) {
			if(variable == numeros[i]) {
				System.out.println("El valor "+variable+" está el en Array");
				condicional = true;
			}
		}
		if(!condicional) {
			System.out.println("El valor "+variable+" no está en el Array");
		}
		leer.close();
		
		
//		Ej1.estaPresente();
	}
	
	//Método solicitado
	public static void  estaPresente() {
		Scanner leer = new Scanner(System.in);
		int[] numeros = {12, 15, 13, 10, 8, 9, 13, 14};
		
		System.out.print("Introducir un valor: ");
		int variable = leer.nextInt();
		
		boolean condicional = false;
		
		for (int i = 0; i < numeros.length; i++) {
			if(variable == numeros[i]) {
				System.out.println("El valor "+variable+" está el en Array");
				condicional = true;
			}
		}
		if(!condicional) {
			System.out.println("El valor "+variable+" no está en el Array");
		}
		leer.close();
	}
}
