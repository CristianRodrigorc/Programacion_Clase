package ejercicios;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class MetodosMain {
	static Scanner sc = new Scanner(System.in);

	public static void askNombre(ArrayList pokemon, String nombrePokemon, boolean tipoValido) {
		int count = 0;
		do {
			try {
				nombrePokemon = sc.nextLine();
				nombrePokemon = nombrePokemon.toUpperCase();
				System.out.println();
				for (int i = 0; i < nombrePokemon.length(); i++) {
					if (((char) nombrePokemon.charAt(i) >= 65 && (char) nombrePokemon.charAt(i) <= 90)
							|| (char) nombrePokemon.charAt(i) == 165) {
					} else {
						count++;
					}
				}
//				System.out.println(count);
				if (count == 0) {
					tipoValido = !tipoValido;// Si se ingresa un valor válido, salimos del bucle
				} else {
					System.out.println("El nombre unicamente debe contener letras... Intente otra vez:");
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada no válida. Introduce un tipo de Pokémon válido.");
				sc.nextLine();
			}
		} while (!tipoValido);
		tipoValido = !tipoValido;
	}
}
