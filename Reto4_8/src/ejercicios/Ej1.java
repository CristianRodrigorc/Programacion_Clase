package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ej1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<String> cadenaLeng = new ArrayList();
		menuLeng(cadenaLeng);
		
		
	}
	
	public static void menuLeng(ArrayList list) {
		boolean condition = false;
		
		int selection = 1000;

		System.out.println("Bienvenido al Programa del Ejercicio 2");
		do {
			System.out.println("Presione \"1\" para agregar un Lenguaje");
			System.out.println("Presione \"2\" para insertar un Lenguaje");
			System.out.println("Presione \"3\" para buscar un Lenguaje");
			System.out.println("Presione \"4\" para buscar en que posición se encuentra Python");
			System.out.println("Presione \"5\" para borrar un Lenguaje");
			System.out.println("Presione \"6\" para borrar toda la lista de Lenguaje");
			System.out.println("Presione \"0\" para cerrar el Programa");
			selection = sc.nextInt();
			switch (selection) {
			case 1: {
				addLeng(list);
				break;
			}
			case 2: {
				insertLeng(list);
				break;
			}
			case 3:  {
				recoverLeng(list);
				break;
			}
			case 4: {
				findLeng(list);
				break;
			}
			case 5: {
				removeLeng(list);
				break;
			}
			case 6: {
				removeLeng(list);
				break;
			}
			case 0: {
				System.out.println("Saliendo del Programa...");
				condition = !condition;
				break;
			}
			default:
				System.out.println("Opción no válida...");
			}
		} while (!condition);
	}

	public static void addLeng(ArrayList list) {
		sc.nextLine();
		System.out.print("Ingrese un Lenguaje de Programación:");
		list.add(sc.nextLine());
	}

	public static void printLeng(ArrayList list) {

		for (int i = 0; i < list.size() - 1; i++) {
			System.out.println((i + 1) + ". " + list.get(i));
		}
	}

	public static void insertLeng(ArrayList list) {

		System.out.println("Indique la posición en la que desea insertar un número");
		int position = sc.nextInt();

		sc.nextLine();
		System.out.println("Indique el número a insertar");
		String newLeng = sc.nextLine();

		if (position >= 0 && position <= list.size()) {
			// Insertamos el npumero en la posción indicada
			list.add(position, newLeng);
		} else {
			System.out.println("La posición indicada no es correcta");
		}
	}
	
	public static void recoverLeng(ArrayList list) {
		int position;
		System.out.println("Indique una posición: ");
		position= sc.nextInt();
		
		System.out.println("El elemento de la posición "+ position + " es: "+ list.get((Integer)position));
	}
	
	public static void findLeng(ArrayList list) {
		sc.nextLine();
		String findLeng;
		int positionLeng;

		System.out.println("Indique el Lenguaje de Programación que desea buscar:");
		findLeng = sc.nextLine();
		positionLeng = list.indexOf((String)findLeng);
		
		if (positionLeng >= 0) {
			System.out.println("El Lenguaje " + findLeng + " se encuentra en la posición " + positionLeng);
		} else {
			System.out.println("El Lenguaje " + findLeng + " no se en la lista de Lenguajes de Programación");
		}
	}
	
	public static void removeLeng(ArrayList list) {
		String deleteLeng;
		int position;
		System.out.println("Indique el Lenguaje que desea borrar:");
		deleteLeng = sc.nextLine();
		
		position = list.indexOf(deleteLeng);
		
		if(position >= 0) {
			list.remove(position);
		}else {
			System.out.println("El lenguaje indicado no está en la lista");
		}
		
		printLeng(list);
	}
	
	public static void deleLeng (ArrayList list) {
		
		list.clear();
		
		printLeng(list);
	}
}
