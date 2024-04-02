package ejercicios;

public class Coches {
	String matricula;
	String marca;
	String modelo;
	Boolean disponibilidad = true;
	
	
	public Coches (String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.disponibilidad = true;
	}


	public Boolean getDisponibilidad() {
		return disponibilidad;
	}


	public void setDisponibilidad(Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
}
