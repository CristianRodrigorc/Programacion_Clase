package ej1;

import java.time.LocalDate;

public class ProductosCongelados extends Productos {

	private int temperature = 0;

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	
	@Override
	public String toString() {
		return "ProductosCongelados [temperature=" + temperature + ", getFechaCaducidad()=" + getFechaCaducidad()
				+ ", getNumLote()=" + getNumLote() + "]";
	}

	public ProductosCongelados(LocalDate fechaCaducidad, int numLote, int temperature) {
		super(fechaCaducidad, numLote);
		this.temperature = temperature;
	}
}
