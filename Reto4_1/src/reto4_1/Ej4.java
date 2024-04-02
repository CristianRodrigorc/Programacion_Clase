package reto4_1;

import java.util.Iterator;

public class Ej4 {
	public static void main(String[] args) {
		int[] numeros = {12, 15, 13, 10, 8, 9, 13, 14};


		max(numeros);

	}
	
	
	public static void max(int array[] ) {
		int maximo = 0;
			for (int i = 0; i < array.length; i++) {
			if(maximo<array[i]) {
				maximo = array[i];
			}
		}
			System.out.println(maximo);
	}
	
}
