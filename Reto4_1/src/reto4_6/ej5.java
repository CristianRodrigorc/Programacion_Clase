package reto4_6;

import java.util.Scanner;

public class ej5 {
	public static void main(String[] args) {
        char[][] tablero = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        char jugadorActual = 'X';

        System.out.println("¡Bienvenido a Tres en raya!");

        while (true) {
            mostrarTablero(tablero);
            System.out.println("Turno del jugador " + jugadorActual);
            realizarMovimiento(tablero, jugadorActual);

            if (haGanado(tablero, jugadorActual)) {
                mostrarTablero(tablero);
                System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
                break;
            }

            if (hayEmpate(tablero)) {
                mostrarTablero(tablero);
                System.out.println("¡Empate! No hay más movimientos posibles.");
                break;
            }

            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
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
        System.out.println();
    }

    public static void realizarMovimiento(char[][] tablero, char jugador) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese la fila (0-2): ");
            int fila = obtenerEntrada();
            System.out.println("Ingrese la columna (0-2): ");
            int columna = obtenerEntrada();

            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
                tablero[fila][columna] = jugador;
                break;
            } else {
                System.out.println("Movimiento inválido. Inténtalo de nuevo.");
            }
        }
    }

    public static int obtenerEntrada() {
        Scanner leer = new Scanner(System.in);
        while (!leer.hasNextInt()) {
            System.out.println("Entrada inválida. Introduce un número.");
            leer.next();
        }
        return leer.nextInt();
    }

    public static boolean haGanado(char[][] tablero, char jugador) {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) ||
                (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
                return true;
            }
        }

        // Verificar diagonales
        return (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
               (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador);
    }

    public static boolean hayEmpate(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false; // Todavía hay casillas disponibles
                }
            }
        }
        return true; // No hay más casillas disponibles, empate
    }
}
