package ejercicios;

import java.awt.Menu;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Tren> trenes = new ArrayList<>();

	public static void main(String[] args) {
		Main main = new Main();
		main.menuTrenes();
	}

	public void menuTrenes() {
		boolean condition = false;
		boolean conditionTry = false;
		int opcionesMenu = 0;
		System.out.println("******BIENVENIDO******");

		do {
			System.out.println("Presione 1 para Dar de alta un tren:");
			System.out.println("Presione 2 para imprimir los trenes:");
			System.out.println("Presione 3 para ordenar los trenes");
			System.out.println("Presione 4 para Visualizar los trenes ordenados por fecha:");
			System.out.println("Presione 0 para salir");
			do {
				try {
					opcionesMenu = sc.nextInt();
					conditionTry = true; // Si se ingresa un entero válido, salimos del bucle
				} catch (InputMismatchException e) {
					System.out.println("Entrada no válida. Introduce un número.");
					sc.nextLine();
				}
			} while (!conditionTry);

			switch (opcionesMenu) {
			case 1:
				altaTren();
				break;
			case 2:
				imprimirTrenesPorPVP();
				break;
			case 3:
				ordenarTrenesPorOrigen();
				break;
			case 4:
				visualizarTrenesOrdenadosPorFecha();
				break;
			case 0:
				System.out.println("Saliendo del Menú...");
				condition = true;
				break;
			default:
				System.out.println("Opción no válida.");
				break;
			}
		} while (!condition);
	}

	public void altaTren() {
		// Solicitar al usuario los detalles del tren
		System.out.println("Introduce el origen del tren:");
		String origen = sc.next();
		System.out.println("Introduce el destino del tren:");
		String destino = sc.next();
		System.out.println("Introduce la fecha del tren (yyyy-MM-dd):");
		LocalDate fecha = LocalDate.parse(sc.next());
		System.out.println("Introduce la tarifa del tren:");
		double tarifa = sc.nextDouble();

		// Crear una instancia de tren según el tipo deseado
		Tren tren;
		System.out.println("Escoja el tipo de tren: (1: LargoRecorrido, 2: Cercanias, 3: Turistico)");
		int tipoTren = sc.nextInt();
		switch (tipoTren) {
		case 1:
			System.out.println("¿Ofrece servicio de cafetería? (true/false)");
			boolean servicioCafeteria = sc.nextBoolean();
			System.out.println("Introduce el tiempo de viaje:");
			int tiempoViaje = sc.nextInt();
			tren = new LargoRecorrido(origen, destino, fecha, servicioCafeteria, tiempoViaje);
			break;
		case 2:
			System.out.println("¿Tiene parking? (true/false)");
			boolean parking = sc.nextBoolean();
			System.out.println("Introduce el número de estaciones:");
			int numEstaciones = sc.nextInt();
			tren = new Cercanias(origen, destino, fecha, parking, numEstaciones);
			break;
		case 3:
			System.out.println("Introduce el nombre turístico:");
			String nombreTuristico = sc.next();
			tren = new Turistico(origen, destino, fecha, nombreTuristico);
			break;
		default:
			System.out.println("Tipo de tren no válido.");
			return;
		}

		// Asignar la tarifa al tren
		tren.setTarifa(tarifa);

		// Agregar el tren al ArrayList
		trenes.add(tren);
	}

	public void imprimirTrenesPorPVP() {
		// Ordenar los trenes por PVP
		trenes.sort(Comparator.comparingDouble(Tren::calcularPVP));

		// Imprimir los trenes
		for (Tren tren : trenes) {
			System.out.println(tren);
		}
	}

	public void ordenarTrenesPorOrigen() {
//		 Ordenar los trenes por origen
		trenes.sort(Comparator.comparing(Tren::getOrigen));

		// Imprimir los trenes
		for (Tren tren : trenes) {
			System.out.println(tren);
		}
		
//        trenes.sort((t1, t2) -> {
//            if (t1 instanceof LargoRecorrido && t2 instanceof LargoRecorrido) {
//                return ((LargoRecorrido) t1).getOrigen().compareTo(((LargoRecorrido) t2).getOrigen());
//            } else if (t1 instanceof Cercanias && t2 instanceof Cercanias) {
//                return ((Cercanias) t1).getOrigen().compareTo(((Cercanias) t2).getOrigen());
//            } else if (t1 instanceof Turistico && t2 instanceof Turistico) {
//                return ((Turistico) t1).getOrigen().compareTo(((Turistico) t2).getOrigen());
//            } else {
//                return 0; // Si los tipos de tren son diferentes, no se puede comparar por origen
//            }
//        });
	}

	public void visualizarTrenesOrdenadosPorFecha() {
		// Ordenar los trenes por fecha
		trenes.sort(Comparator.comparing(Tren::getFecha));

		// Imprimir los trenes
		for (Tren tren : trenes) {
			System.out.println(tren);
		}
	}
}