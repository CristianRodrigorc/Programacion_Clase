package reto4_2;

public class Ej4 {
	public static void main(String[] args) {
		int dni = 12345678;
		int numLetra;
		int resto;
		
		resto = dni%23;
		
		char dniLetra [] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		letraDNI(dniLetra, resto);
	}
	
	//Método para imprimir un array con su índice 
	public static void letraDNI (char array [], int indice) {
		
		System.out.println(array[indice]);
	}
}
