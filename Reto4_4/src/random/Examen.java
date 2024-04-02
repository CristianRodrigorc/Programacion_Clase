package random;
import java.util.Scanner;

public class Examen {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		boolean condition = false;
		int longitud;
		do {
			System.out.print("Introducir un número mayor o igual a 0: ");
			longitud = leer.nextInt();
			if (longitud >= 0) {
				condition = !condition;
			}
		} while (!condition);

		// Bucle para que imprima el Factorial en función al número ingresado
		for (int i = 0; i <= longitud; i++) {
			System.out.println(i + "! = " + calcularFactorial(i));
		}
	}

	// método para Calcular el Factorial
	private static int calcularFactorial(int num) {
		if (num == 0) {
			return 1;
		} else {
			int factorial = 1;
			for (int i = 1; i <= num; i++) {
				factorial *= i;
			}
			return factorial;
		}
	}
}
