package reto4_2;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		char abc [] = new char [26];
		int ascii = 65;
		int contador = 0;
		for (char c : abc) {
			abc[contador]=(char) ascii;
			contador++;
			ascii++;
		}
//		for (char d : abc) {
//			System.out.print(d+ " ");
//		}
		mostrar(abc);	
	}

	public static void mostrar(char array[]) {
		Scanner leer = new Scanner(System.in);
			int indice;
			String sumaChar="";
		do {
			System.out.print("Introduce un número del 0 al 25 o introduce un número negativo para cerrar el programa:");
			indice = leer.nextInt();
			if(indice>=0 && indice<26){
			System.out.println(sumaChar+=array[indice]);
			}else {
				System.out.println("Indice fuera del rango");
			}
		} while (indice>=0);
			System.out.println("Cerrando el programa...");	
	}
}
