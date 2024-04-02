package reto4_1;

import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
		
		longitudMax();
		
	}
	public static void longitudMax() {
		Scanner leer = new Scanner(System.in);
		String caracteres [] = new String [4];
		int max = 0;
		String reemplazo = "";
		
		for (int i = 0; i < caracteres.length; i++) {
			System.out.print("Introducir un caracter: ");
			caracteres[i]= leer.nextLine();
		}
		
		for (int i = 0; i < caracteres.length; i++) {
			if(caracteres[i].length()> max){
				max = caracteres[i].length();
				reemplazo = caracteres[i];
			}
		}
		System.out.println(reemplazo);
	}
}
