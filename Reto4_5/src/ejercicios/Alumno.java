package ejercicios;

import java.time.LocalDate;
import java.util.Arrays;

public class Alumno {
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private double notas [] = new double [3];
	
    // Constructor de 3 parámetros
	public Alumno(String nombre,String apellido, LocalDate fechaNacimiento ) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.notas = new double [3]; // Se inicializa el array de notas con tamaño 3
	}
	
	public Alumno() {
	        // Valores en 0
	        this.nombre = "";
	        this.apellido = "";
	        this.fechaNacimiento = LocalDate.now(); // Fecha de nacimiento en la fecha actual
	        this.notas = new double[3];
	}
	
	// Métodos getter y setter para acceder a los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
 // Método para calcular la media de las notas
    public double calcularMedia() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
    
    
    // Método para imprimir Alumno
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Notas: " + Arrays.toString(notas));
    }
    
 // Método toString
    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }
    // Métodos para establecer las notas de inglés, francés y alemán
    public void setNotaIngles(double notaIngles) {
        notas[0] = notaIngles;
    }

    public void setNotaFrances(double notaFrances) {
        notas[1] = notaFrances;
    }

    public void setNotaAleman(double notaAleman) {
        notas[2] = notaAleman;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Alumno alumno1 = new Alumno("Juan", "Perez", LocalDate.of(2000, 1, 1));
        alumno1.setNotaIngles(7.5);
        alumno1.setNotaFrances(8.0);
        alumno1.setNotaAleman(9.2);

        // 
        alumno1.imprimirInformacion();

        // Calcular y mostrar la media de las notas
        System.out.println("Media de las notas: " + alumno1.calcularMedia());

        // Mostrar información del alumno utilizando el método toString()
        System.out.println(alumno1.toString());
    }

}
