package ejericios;



public class EmpleadoMain {
	public static void main(String[] args) {
		
		Empleados e1 = new Empleados("Brayan", 1800, 2000, 7, 11);
		Empleados e2 = new Empleados("Sara"); //usa el constructor predefinido con valores en clase empleado
		Empleados e3 = new Empleados("Paula");
		
		
		

		Empleados[] empleados = new Empleados[3];

		empleados[0] = e1;
		empleados[1] = e2;
		empleados[2] = e3;

		for (Empleados nuevoEmpleado : empleados) { //recorro y guardo en nuevoEmpleado e imprimo
			System.out.println(nuevoEmpleado);

		}

		for (int i = 0; i < empleados.length; i++) { //recorro y le subo sueldo a todos el 5%
			empleados[i].subeSueldo(5);

		}
		System.out.println("--------------------------------------");
		for (Empleados empleado2 : empleados) {
			System.out.println(empleado2);

		}

	}

}
