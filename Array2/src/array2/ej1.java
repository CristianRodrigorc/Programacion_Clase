package array2;

import java.util.Scanner;

public class ej1 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		System.out.print("ingrese el número de lados de un cuadrado: ");
		int ladosCuadrado = leer.nextInt();

		int cuadradoArray[][] = new int[ladosCuadrado][ladosCuadrado];

		for (int i = 0; i < cuadradoArray.length; i++) {
			for (int j = 0; j < cuadradoArray.length; j++) {
				if(i == 0 || i == ladosCuadrado - 1 || j == 0 || j == ladosCuadrado - 1) {
					cuadradoArray[i][j] = 42;
				} else {
					cuadradoArray[i][j] = 32;
				}
			}
		}
			
		for (int i = 0; i < cuadradoArray.length; i++) {
			for (int j = 0; j < cuadradoArray.length; j++) {
				System.out.print((char)cuadradoArray[i][j]+ " ");
			}
			System.out.println();
		}
	}

}

