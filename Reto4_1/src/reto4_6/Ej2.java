package reto4_6;

import java.util.Random;

public class Ej2 {

	public static void main(String[] args) {
		int longitudArray = 20;
//		Random generador = new Random();
//		int generado = generador.nextInt(100)+100;
		int arrayInicial[] = new int[longitudArray];

		// Iniciamos el Array e Imprimimos
		asignarRandom(arrayInicial);
		imprimirArrays(arrayInicial);

		System.out.println();

		comprobarRepetidas(arrayInicial);
		
		
		System.out.println(contarPrimos(arrayInicial));
		int arrayPrimos[] = obtenerPrimos(arrayInicial);
		imprimirArrays(arrayPrimos);
		

	}

	public static void imprimirArrays(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");

		}
	}

	public static void asignarRandom(int vector[]) {
		Random generador = new Random();
		int auxiliar = 0;
		for (int i = 0; i < vector.length; i++) {
			if (i == 0) {
				vector[i] = generador.nextInt(100) + 100;
			} else {
				for (int j = 0; j < i; j++) {
					do {
						auxiliar = generador.nextInt(100) + 100;
						vector[i] = auxiliar;
					} while (!esNumeroValido(vector, auxiliar, i));
				}
			}
		}

	}

	public static void comprobarRepetidas(int vector[]) {
		int contador = 0;
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < i; j++) {
				if (vector[i] == vector[j]) {
					contador++;
					System.out.println("En la posición: " + (i + 1) + " y " + (j + 1));
				}
			}
		}
		System.out.println("No hay números repetidos");
	}

	public static boolean esNumeroValido(int[] array, int numero, int indice) {
		if (numero < 100 || numero > 199) {
			return false;
		}

		for (int i = 0; i < indice; i++) {
			if (array[i] == numero) {
				return false;
			}
		}

		return true;
	}

//	public static boolean esPrimo(int vector[]) {
//		for (int i = 0; i < vector.length; i++) {
//			for (int j = 2; j <= Math.sqrt(vector[i]); j++) {
//				if (vector[i] % j == 0) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}
//
//	public static int saberCantidadPrimos(int vector[]) {
//		int auxiliar= 0;
//		int contador = 0;
//		for (int i = 0; i < vector.length; i++) {
//			for (int j = 2; j <= Math.sqrt(vector[i]); j++) {
//				if (vector[i] % j == 0) {
//					auxiliar++;
//				}
//				if(auxiliar==0) {
//					contador++;
//				}
//			}
//		}
//		return contador;
//	}

    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int contarPrimos(int vector[]) {
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (esPrimo(vector[i])) {
                contador++;
            }
        }
        return contador;
    }
	
	
    public static int[] obtenerPrimos(int vector[]) {
        int cantidadPrimos = contarPrimos(vector);
        int arrayPrimos[] = new int[cantidadPrimos];
        int indicePrimos = 0;

        for (int i = 0; i < vector.length; i++) {
            if (esPrimo(vector[i])) {
                arrayPrimos[indicePrimos] = vector[i];
                indicePrimos++;
            }
        }

        return arrayPrimos;
    }
}
