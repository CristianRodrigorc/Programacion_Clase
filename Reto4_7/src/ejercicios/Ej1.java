package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ej1 {
	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> numerosIngresados = new ArrayList();
		llenarArrayList(numerosIngresados);
		imprimirArrayList(numerosIngresados);
		ordenarNumeros(numerosIngresados);
		imprimirArrayList(numerosIngresados);
		
		sumayMedia(numerosIngresados);
		
	}

	public static ArrayList llenarArrayList(ArrayList list) {
		Integer auxiliar = 10000;

		do {
			System.out.println("Ingrese un número entero: ");
			auxiliar = leer.nextInt();

			if (auxiliar != 0) {
				list.add(auxiliar);
			}
		} while (auxiliar != 0);

		return list;
	}

	public static void imprimirArrayList(ArrayList list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ". " + list.get(i));
		}
	}

	public static void ordenarNumeros(ArrayList list) {
		Integer auxiliar = 0;
		for (Integer i = 0; i < list.size() - 1; i++) {
			for (Integer j = 0; j < i; j++) {
				if (i != j && ((Integer) list.get(i)) < (Integer) list.get(j)) {
					auxiliar = (Integer) list.get(i);
					list.set(i, list.get(j));
					list.set(j, auxiliar);
				}
			}

			System.out.println("Valor Max. es: " + list.get(list.size() - 1));
			System.out.println("Valor Min. es: " + list.get(0));
		}

	}

	public static void sumayMedia(ArrayList list) {
		Integer suma = 0;
		for (int i = 0; i < list.size()-1; i++) {
			suma += (Integer)list.get(i);
		}
		
		System.out.println("La suma total es: "+suma);
		
		Integer media =  suma/list.size();
		System.out.println("La media es: "+ media);
		
		
		for (int i = 0; i < list.size()-1; i++) {
			if((Integer)list.get(i) > media ) {
				System.out.println((i+1)+". "+list.get(i));
			}
		}
	}
	


}
