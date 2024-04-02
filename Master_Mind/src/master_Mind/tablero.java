package master_Mind;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class tablero {
	static Scanner leer = new  Scanner(System.in);
	
	public static void main(String[] args) {
		int longitud = 0;
		int arrayTabla [] [] = new int [11][];
		int randomcolores[]=new int [8];
		crearTabla(arrayTabla, longitud);
//		imprimirTabla(arrayTabla);
		System.out.println("Asignamos los Random");
		asignarRandom(arrayTabla);
		imprimirTabla(arrayTabla);
		
//		Ingresamos los números
//		llenarTabla(arrayTabla);
	}
	
	public static void crearTabla(int vector [][], int longitud){
		System.out.print("Indique la cantidad de colores con los que se jugará (4-6-8): ");
		longitud = leer.nextInt();
		for (int i = 0; i < vector.length; i++) {
			vector[i] = new int[longitud];
		}
				
	}
	
	public static void imprimirTabla(int vector [][]) {
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[0].length; j++) {
				System.out.print("["+vector[i][j]+"]");
			}
			System.out.println();
		}
	}
	
	public static void asignarRandom(int vector [][]) {
		Random random = new Random();
		boolean condition = true;
		int variable ;
		do {
			System.out.println("Se repetirán los números? 1 para SI y 2 para NO:");
			variable = leer.nextInt();
			if(variable == 1 || variable == 2) {
				condition = !condition;
			}
		} while (condition);


		if(variable==1) {
			for (int i = 0; i < vector[0].length; i++) {
				vector[vector.length-1][i] = random.nextInt(8)+1;
			}
		}else if(variable==2){
			int auxiliar;
			for (int i = 0; i < vector[0].length; i++) {
				auxiliar = random.nextInt(8)+1;
				if(!busquedaRandom(vector, i, auxiliar)) {
					vector[vector.length-1][i] = auxiliar;
				}	
			}

		}
	}
	
	
	public static boolean busquedaRandom(int vector [][], int i,int auxiliar  ) {

		for (int j = 0; j < i; j++) {
			if(auxiliar == vector[vector.length-1][i]) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void llenarTabla(int vector [][]) {
		int auxiliar2;
		int contador=1;
		for (int i = vector.length-2; i >= 0; i--) {
			System.out.println("Intento Nº"+contador);
			for (int j = 0; j < vector[0].length; j++) {
				System.out.println("Ingrese un nùmero del 1 al 8");
				auxiliar2=leer.nextInt();
				vector[i][j]=auxiliar2;
				if(vector[i][j]==vector[vector.length-1][j]) {
					System.out.println("Número acertado");
				}
				
				if(auxiliar2==vector[i][j]) {
					System.out.println("Número en la fila");
				}
			}
			imprimirTabla(vector);
			contador++;
		}
		
	}
}
