package arrays1;

import java.util.Iterator;

public class Arrays11 {
	public static void main(String[] args) {
		int [] miArray  = new int[5];
		miArray[0] = 55;
		miArray[1] = 22;
		miArray[2] = 31;
		miArray[3] = 14;
		miArray[4] = 75;
		
		for (int i = 0; i < miArray.length; i++) {
			System.out.println("miArray["+i+"] ="+ miArray[i]);
		}
		
		int miArray2 []= {22,44,23,55,24,66,26};
		
		for (int i = 0; i < miArray2.length; i++) {
			System.out.println("miArray["+i+"] ="+ miArray2[i]);
		}
	}
}
