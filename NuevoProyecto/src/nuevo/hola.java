package nuevo;

import java.util.Scanner;

public class hola {
	public static void main(String[] args) {
		System.out.println("Hola mundo");
		System.out.println("Mi primer proyecto");
		
		Scanner vc = new Scanner(System.in);
		System.out.println("Introduce una variable");
		double num = vc.nextDouble();
		
		System.out.println("Introduce otra variable");
		double num2 = vc.nextDouble();
		
		if(num > num2){
			System.out.println(num-num2);
		}else {
			System.out.println(num2-num);
		}
		
		
	}
}
