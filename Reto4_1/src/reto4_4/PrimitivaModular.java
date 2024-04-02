package reto4_4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

public class PrimitivaModular {
	public static Scanner sc = new Scanner(System.in);
	public static Random rnd = new Random();

	public static void main(String[] args) {
		// Definición de las variables
		final int CANTIDAD_NUMEROS = 6; // Números en una apuesta de lotería primitiva
		int[] ganadora = new int[CANTIDAD_NUMEROS]; // combinación ganadora
		int[] miPrimitiva = new int[CANTIDAD_NUMEROS]; // apuesta del usuario
		int aciertos= 0;
		// Cargar/Inicializar el array ganadora sin repetidos
		inicializarArrayAleatorio(ganadora);

		// Cargar/Inicializar el array miPrimitiva sin repetidos
//		inicializarArrayUsuario(miPrimitiva);

		// imprimir aciertos
		System.out.println("La combinación ganadora es  : " + Arrays.toString(ganadora));
		inicializarArrayUsuario(miPrimitiva);
		System.out.println("tu apuesta es : " + Arrays.toString(miPrimitiva));
		System.out.println(
				"Has tenido " + comprobarAciertos(ganadora, miPrimitiva, aciertos) + " acierto(s) ");
	}

	static void inicializarArrayAleatorio(int[] vector) {
		// Código del método
		for (int i = 0; i < vector.length; i++) {
			do {
				vector[i] = rnd.nextInt(49) + 1;
				
			} while (vector[i] != vector [i]);

		}
	}

	/****************************************************************************/
	/* El método va a inicializar un array con números pedidos al usuario */
	/* Si el número generado ya está en el array o está fuera del rango 1..49 */
	/* se pide al usuario que introduzca otro número */
	/****************************************************************************/
	static void inicializarArrayUsuario(int[] vector) {

		// Código del método
		for (int j = 0; j < vector.length; j++) {

			System.out.println("Ingrese un número del 1 al 50");
			vector[j] = PrimitivaModular.sc.nextInt();
		}
	}

	/*****************************************************************************/
	/* El método recibe dos arrays y comprueba cuantos números están contenidos */
	/* en los dos arrays . Devuelve el número de aciertos */
	/*****************************************************************************/
	static int comprobarAciertos(int[] vector1, int[] vector2, int aciertos) {

		// Código del método

		for (int i = 0; i < vector2.length; i++) {
			for (int j = 0; j < vector2.length; j++) {
				if (vector1[i] == vector2[j]) {
					aciertos++;
				}
			}
		}

		return aciertos;

	}

}
