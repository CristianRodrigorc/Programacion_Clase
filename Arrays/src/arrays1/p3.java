package arrays1;

public class p3 {
	public static void main(String[] args) {
		int [] matrizAleatorios = new int [100];
		for( int i = 0; i < matrizAleatorios.length; i++) {
			matrizAleatorios[i] =  (int) Math.round(Math.random()*100);
		}
		for(int i=0; i < matrizAleatorios.length;i++) {
			System.out.println(matrizAleatorios[i] + " ");
		}
	}
}