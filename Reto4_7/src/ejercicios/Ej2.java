package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		menuEjercicio(list);
	}

	public static void menuEjercicio(ArrayList list) {
		boolean condition = false;
		int selection = 1000;

		System.out.println("Bienvenido al Programa del Ejercicio 2");
		do {
			System.out.println("Presione \"1\" para agregar un número");
			System.out.println("Presione \"2\" para buscar un número");
			System.out.println("Presione \"3\" para modificar un número");
			System.out.println("Presione \"4\" para eliminar un número");
			System.out.println("Presione \"5\" para insertar un número en una posición específica");
			System.out.println("Presione \"0\" para cerrar el Programa");
			selection = sc.nextInt();
			switch (selection) {
			case 1: {
				addNum(list);
				break;
			}
			case 2: {
				findNum(list);
				break;
			}
			case 3: {
				modifyNum(list);
				break;
			}
			case 4: {
				deleteNum(list);
				break;
			}
			case 5: {
				insetNum(list);;
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

	public static void printArrayNum(ArrayList list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ". " + list.get(i));
		}
	}

	public static void addNum(ArrayList list) {
		System.out.println("Ingrese el nuevo número");
		list.add(sc.nextInt());

		System.out.println("Número agregado correctamente.");
		System.out.println("La lista de números actual es:");
		printArrayNum(list);
	}

	public static void findNum(ArrayList list) {
		System.out.println("Ingrese el número que desea buscar");
		int findNum = sc.nextInt();
		int positionNum = list.indexOf((Integer)findNum); // Buscamos el ídice del número

		if (positionNum >= 0) {
			System.out.println("El número " + findNum + " se encuentra en la posición " + positionNum);
		} else {
			System.out.println("El número " + positionNum + " no se encuentra en la Lista de números");
		}
	}

	public static void modifyNum(ArrayList list) {
		System.out.println("Indique la posición del valor a cambiar:");
		int position = sc.nextInt();

		System.out.println("Indique el nuevo valor:");
		int newValue = sc.nextInt();

		list.set(position, newValue);

		printArrayNum(list);
	}

	public static void deleteNum(ArrayList list) {
		System.out.println("Ingrese el número que desea eliminar");
		int deleteNum = sc.nextInt();

		// Verificamos si el número ingresado está en el array
		if (list.contains(deleteNum)) {
			list.remove((Integer) deleteNum);
		} else {
			System.out.println("El número " + deleteNum + " no se encuentra en la Lista de números");
		}
		
		printArrayNum(list);
	}


//	Método que desplaza una posición a la derecha desde la posición indicada 
//	para insertar el número indicado
	public static void insetNum(ArrayList list) {

		System.out.println("Indique la posición en la que desea insertar un número");
		int position = sc.nextInt();

		System.out.println("Indique el número a insertar");
		int newNum = sc.nextInt();

		if (position >= 0 && position <= list.size()) {
			// Insertamos el npumero en la posción indicada
			list.add(position, newNum);
		} else {
			System.out.println("La posición indicada no es correcta");
		}
		
		printArrayNum(list);
	}
}
