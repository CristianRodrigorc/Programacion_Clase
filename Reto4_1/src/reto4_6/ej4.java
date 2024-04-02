package reto4_6;

import java.util.Random;
import java.util.Scanner;

public class ej4 {
	  public static void main(String[] args) {
	        char[][] tablero = new char[5][5];
	        inicializarTablero(tablero);

	        int tesoroX = generarPosicionAleatoria();
	        int tesoroY = generarPosicionAleatoria();
	        int minaX, minaY;

	        do {
	            minaX = generarPosicionAleatoria();
	            minaY = generarPosicionAleatoria();
	        } while (minaX == tesoroX && minaY == tesoroY);

	        boolean encontrado = false;

	        System.out.println("Iniciando Busca el tesoro");

	        while (!encontrado) {
	            mostrarTablero(tablero);
	            System.out.println("Introduce la fila (0-4): ");
	            int fila = obtenerEntrada();
	            System.out.println("Introduce la columna (0-4): ");
	            int columna = obtenerEntrada();

	            if (fila < 0 || fila >= 5 || columna < 0 || columna >= 5) {
	                System.out.println("Posición fuera del tablero. Inténtalo de nuevo.");
	                continue;
	            }

	            int distancia = calcularDistancia(fila, columna, minaX, minaY);

	            if (distancia == 0) {
	                System.out.println("Has pisado una mina. Fin del juego.");
	                break;
	            } else if (distancia == 1) {
	                System.out.println("¡Cuidado! Hay una mina cerca.");
	            }

	            if (fila == tesoroX && columna == tesoroY) {
	                System.out.println("¡Felicidades! ¡Encontraste el tesoro!");
	                encontrado = true;
	            } else {
	                System.out.println("No has encontrado el tesoro. Sigue intentándolo.");
	                tablero[fila][columna] = 'X'; // Marcamos la posición probada
	            }
	        }
	    }

	    public static void inicializarTablero(char[][] tablero) {
	        for (int i = 0; i < tablero.length; i++) {
	            for (int j = 0; j < tablero[i].length; j++) {
	                tablero[i][j] = '-';
	            }
	        }
	    }

	    public static void mostrarTablero(char[][] tablero) {
	        System.out.println("Tablero:");
	        for (int i = 0; i < tablero.length; i++) {
	            for (int j = 0; j < tablero[i].length; j++) {
	                System.out.print(tablero[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static int generarPosicionAleatoria() {
	        Random random = new Random();
	        return random.nextInt(5);
	    }

	    public static int obtenerEntrada() {
	        Scanner leer = new Scanner(System.in);
	        while (!leer.hasNextInt()) {
	            System.out.println("Entrada inválida. Introduce un número.");
	            leer.next();
	        }
	        return leer.nextInt();
	    }

	    public static int calcularDistancia(int x1, int y1, int x2, int y2) {
	        return Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2));
	    }
}
