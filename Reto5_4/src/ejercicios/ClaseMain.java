package ejercicios;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class ClaseMain{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Pokemon> pokemones = new ArrayList<>();
		
		ClaseMain claseMain = new ClaseMain();
		claseMain.menuPokemon(pokemones);
		
	}

	public void menuPokemon(ArrayList pokemones) {
		boolean condition = false;
		System.out.println("******Bienvenido******");
		do {
			try {

				System.out.println("Presione 1 para añadir un Pokemon");
				System.out.println("Presione 2 para usar la Pokedex y ver tus pokemons");
				System.out.println("Presione 0 para salir del Menú");
				int opcion = sc.nextInt();
				sc.nextLine();
				switch (opcion) {
				case 1:
					añadirPokemon(pokemones);
					break;
				case 2:
					statusPokemon(pokemones);
					break;
				case 0:
					condition = true; // Salir del bucle
					break;
				default:
					System.out.println("Opción no válida. Inténtalo de nuevo.");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada no válida. Introduce un número entero.");
				sc.nextLine();
			}
		} while (!condition);
	}


	public void añadirPokemon(ArrayList pokemones) {
		boolean tipoValido = false;
		String variableTipo = "";
		String nombrePokemon = "";
		int puntosVidaPokemon = 0;
		int puntosAtaquePokemon = 0;
		do {
			System.out.println("Elegir el tipo del Pokemon a añadir: Fuego, Agua o Planta");

			do {
				try {
					variableTipo = sc.nextLine().toUpperCase();
					tipoValido = !tipoValido;// Si se ingresa un entero válido, salimos del bucle
				} catch (InputMismatchException e) {
					System.out.println("Entrada no válida. Introduce un tipo de Pokémon válido.");
					sc.nextLine();
				}
			} while (!tipoValido);
			tipoValido = !tipoValido;
			System.out.println(tipoValido);
			System.out.println("Ingrese el nombre del pokemon: ");
				MetodosMain.askNombre(pokemones, nombrePokemon, tipoValido);


			System.out.println("Ingrese los puntos de salud del pokemon: ");
			do {
				try {
					puntosVidaPokemon = sc.nextInt();
					tipoValido = !tipoValido; // Si se ingresa un entero válido, salimos del bucle
				} catch (InputMismatchException e) {
					System.out.println("Entrada no válida. Introduce un número entero.");
					sc.nextLine();
				}
			} while (tipoValido);
			tipoValido = !tipoValido;

			do {
				try {
					System.out.println("Ingrese los puntos de ataque del pokemon: ");
					puntosAtaquePokemon = sc.nextInt();
					tipoValido = !tipoValido; // Si se ingresa un entero válido, salimos del bucle
				} catch (InputMismatchException e) {
					System.out.println("Entrada no válida. Introduce un número entero.");
					sc.nextLine();
				}
			} while (tipoValido);
			tipoValido = !tipoValido;

			if (variableTipo.equals("FUEGO") || variableTipo.equals("AGUA") || variableTipo.equals("PLANTA")) {
				tipoValido = true;
				switch (variableTipo) {
				case "FUEGO": {
					PokemonFuego pokemon = new PokemonFuego(nombrePokemon, puntosVidaPokemon, puntosAtaquePokemon);
				}
					break;
				case "AGUA": {
					PokemonAgua pokemon = new PokemonAgua(nombrePokemon, puntosVidaPokemon, puntosAtaquePokemon);
				}
					break;
				case "PLANTA": {
					PokemonPlanta pokemon = new PokemonPlanta(nombrePokemon, puntosVidaPokemon, puntosAtaquePokemon);
				}
					break;
				}
			} else {
				System.out.println("Tipo de Pokémon no válido. Inténtalo de nuevo.");
			}
		} while (!tipoValido);
	}
	
	public void statusPokemon(ArrayList pokemon) {
		int indice = 1;
		for (Object object : pokemon) {
			System.out.println("El pokemon 1: "+object.toString());
			indice++;
		}
	}
}
