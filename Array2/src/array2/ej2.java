package array2;

import java.util.Iterator;
import java.util.Scanner;

public class ej2 {
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		
		double numArray [][] = new double [5] [6];
		double sumaFilas = 0;
		double sumaColumnas = 0;
		
		for (int i = 0; i < numArray.length-1; i++) {
			sumaFilas = 0;
			sumaColumnas = 0;
			for (int j= 0; j < numArray[0].length-1; j++) {
				System.out.println("Ingresar el siguiente número");
				numArray [i][j] = leer.nextDouble();
				sumaFilas += numArray [i][j];
				numArray[i][5]=sumaFilas;//Suma las filas
			}	
		}
		
        for (int j = 0; j < numArray[0].length; j++) {
            sumaColumnas = 0;
            for (int i = 0; i < numArray.length; i++) {
                sumaColumnas += numArray[i][j];
            }
            numArray[4][j] = sumaColumnas; // Actualizar la última fila con la suma de la columna
        }



		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray[0].length; j++) {
				System.out.print(numArray[i][j]+ "\t");
			}
			System.out.println();
		}
	}
}
