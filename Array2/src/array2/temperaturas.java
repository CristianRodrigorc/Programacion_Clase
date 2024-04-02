package array2;

import java.util.Iterator;

public class temperaturas {
	
	public static void main(String[] args) {
		//int [] temperaturas = new int [31];
//		int [] temperaturas = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0};
//		int contador = 0;
//		for (String string : args) {
//			System.out.println(temperaturas[contador]);
//			contador++;
//		}
		
		int [][] temperaturas = new int [31][24];
		for (int i = 0; i < temperaturas.length; i++) {
			for (int j = 0; j < temperaturas[0].length; j++) {
				int aleatorio = (int) (Math.random()*20)+1;
				temperaturas [i][j] = aleatorio;
				System.out.print(temperaturas[i][j]+ " ");
				
			}
			System.out.println(" ");
		}
		
		
//		for (int i = 0; i < temperaturas.length; i++) {
//			for (int j = 0; j < temperaturas.length; j++) {
//				
//			}
//		}
	}
}
