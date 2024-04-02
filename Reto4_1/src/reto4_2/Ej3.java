package reto4_2;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.print("Introduce una frase: ");
		String fraseIntroducida = leer.nextLine();
		
		char arrayFrase [] = new char [fraseIntroducida.length()];
		int indice = 0;
		int indiceFrase = 0;
		
		for (char c : arrayFrase) {
			arrayFrase[indice] = fraseIntroducida.charAt(indiceFrase);
			indice++;
			indiceFrase++;
		}
		
		int indiceImprimir = 0 ;
		for (char d : arrayFrase) {
			System.out.println("Array["+indiceImprimir+"]= "+d);
			indiceImprimir++;
		}
	}
	

}
