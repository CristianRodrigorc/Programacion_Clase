package poo2;

import java.util.Arrays;
import java.util.Iterator;

public class EmpleadoMain {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Noel", 1500, 2001, 1, 1);
		Empleado e2 = new Empleado("Brayan", 1400, 2002, 2, 2);
		Empleado e3 = new Empleado("Carol");
		Jefatura j1 = new Jefatura("Jefe", 3000, 2002, 2, 2);
		
		Empleado [] empleados = new Empleado[4];
		
		empleados[0] = e1;
		empleados[1] = e2;
		empleados[2] = e3;
		empleados[3] = j1;
		
		j1.setIncentivo(1000);
		
		Jefatura jefe = (Jefatura) empleados[3];
		jefe.setIncentivo(2000);
		
		Empleado emp = empleados[3];
		
		if(e1 instanceof Jefatura) {
			System.out.println("Jefatura j1: " + e1);
		} else if (e1 instanceof Empleado) {
			System.out.println("Empleado j1: " + e1);
		}
		
		for(Empleado e : empleados) {
			if(e instanceof Empleado) {
				System.out.println("Empleado: " + e);
			} else if (e instanceof Jefatura) {
				System.out.println("Jefatura: " + e);
			}
			
		}
		
		for(int i=0; i<empleados.length; i++) {
			empleados[i].subeSueldo(5);
		}
		
		System.out.println("---------------------------------");
		
		for(Empleado e : empleados) {
			System.out.println(e);
		}
		
		System.out.println("---------------------------------");
		
		Arrays.sort(empleados);
		for(Empleado e : empleados) {
			System.out.println(e);
		}
		
		System.out.println(j1.getNombre() + " " + j1.tomarDecisiones("dar más días de vacaciones"));
	}

}
