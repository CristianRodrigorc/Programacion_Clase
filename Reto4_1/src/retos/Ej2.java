package retos;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int[] numeros = { 12, 15, 13, 10, 8, 9, 13, 14 };

		System.out.print("Introducir un valor: ");
		int variable = leer.nextInt();

		boolean condicional = false;

		for (int i = 0; i < numeros.length; i++) {
			if (variable == numeros[i]) {
				condicional = true;
			}
		}
		if (!condicional) {
			System.out.println("El valor " + variable + " no está en el Array");
		}else {
			System.out.println("El valor " + variable + " está el en Array");
			System.out.print("El valor "+ variable + " está en la posición ");
			for (int i = 0; i < numeros.length; i++) {
				if (variable == numeros[i]) {
					System.out.print((i+1)+ ", ");
				}
			}
		}
		leer.close();
	}
}
