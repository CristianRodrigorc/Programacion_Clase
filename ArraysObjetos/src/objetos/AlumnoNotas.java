package objetos;

import java.util.Arrays;
import java.util.Scanner;

public class AlumnoNotas {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		final int NUM_ALUMNOS = 4;
		final int NUM_ASIGNATURAS = 3;
		AlumnoDAM [] alumnos = new AlumnoDAM [NUM_ALUMNOS];
		
//		alumnos[0]= new AlumnoDAM("Cristian");
//		System.out.println("Nombre: "+alumnos[0].nombre);
		
		for (int i = 0; i < alumnos.length; i++) {
			
			System.out.println("Ingrese el nombre: ");
			
			alumnos[i]= new AlumnoDAM(leer.nextLine());
			
			alumnos[i].notas = new int [NUM_ASIGNATURAS];
			
			
			for (int j = 0; j < NUM_ASIGNATURAS; j++) {
				
				System.out.print("Ingrese la nota "+ (j+1) + " :");
				
				alumnos[i].notas[j] = leer.nextInt();
			}
			
			leer.nextLine();
		}
			
		
			for (AlumnoDAM alu : alumnos) {
				System.out.println(alu.nombre+" ");
//				for (int i = 0; i < NUM_ASIGNATURAS; i++) {
//					System.out.print(alu.notas[i]+" ");
//				}
				System.out.println(Arrays.toString(alu.notas));
				System.out.println("");
			}
		}
	}

