package ej1;

import java.time.LocalDate;

public class Productos {
	
	private LocalDate fechaCaducidad = null;
	private int numLote = 0;
	
	
	
	
	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}


	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}


	public int getNumLote() {
		return numLote;
	}


	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}


	public Productos (LocalDate fechaCaducidad, int numLote ) {
		this.fechaCaducidad = fechaCaducidad;
		this.numLote = numLote;
	}


	@Override
	public String toString() {
		return "Productos [fechaCaducidad=" + fechaCaducidad + ", numLote=" + numLote + "]";
	}
}
