package ejercicios;

import java.util.Scanner;

public class ej1 {
	public static void main(String[] args) {
		
		char arrayABC [] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		metodoPrincipal(arrayABC);
	}
	
	public static void metodoPrincipal(char vector []){
		Scanner leer = new Scanner(System.in);
		boolean condicional = false;
		String sumadeLetras = "";
		
		do {
			System.out.print("Ingrese una posicíon de alguna vocal del 0 al 24: ");
			int numeroLetra = leer.nextInt();

			if(numeroLetra>0 && numeroLetra<vector.length) {
				System.out.println("La letra elegida es: "+ vector[numeroLetra]);
				sumadeLetras += vector[numeroLetra];
			}else if(numeroLetra<0) {
				System.out.println("Fin del programa");
				condicional = !condicional;
			}else {
				System.out.println("Valor ingresado inválido");
			}
		} while (!condicional);
		
		System.out.print("La cadena de caracteres de todas las letras mostradas es: "+sumadeLetras);
	}
}
