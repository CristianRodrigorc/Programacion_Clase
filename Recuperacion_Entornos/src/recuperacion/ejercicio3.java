package recuperacion;

import java.util.Scanner;

public class ejercicio3 {
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese un número:");
		calcularSuma(leer.nextInt());
	}
    public static int calcularSuma(int numeroTotal) {
        int sumaTotal = 0;

        if (numeroTotal > 1) {
            int a = 0, b = 1;
            sumaTotal = a + b;
            System.out.println(a);
            System.out.println(b);

            int contador = 1;
            while (contador <= numeroTotal - 2) {
                int actual = a + b;
                sumaTotal += actual;
                System.out.println(actual);
                a = b;
                b = actual;
                contador++;
            }
        } else if (numeroTotal == 1) {
            sumaTotal = 1;
        }

        return sumaTotal;
    }
}
