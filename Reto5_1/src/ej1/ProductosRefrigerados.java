package ej1;

import java.time.LocalDate;

public class ProductosRefrigerados extends Productos {
	private String codSupervision = "";
	
	public String getCodSupervision() {
		return codSupervision;
	}

	public void setCodSupervision(String codSupervision) {
		this.codSupervision = codSupervision;
	}
	
	public ProductosRefrigerados(LocalDate fechaCaducidad, int numLote, String codSupervision) {
		super(fechaCaducidad, numLote);
		this.codSupervision = codSupervision;
	}
	
	

	@Override
	public String toString() {
		return "ProductosRefrigerados [codSupervision=" + codSupervision + ", getFechaCaducidad()="
				+ getFechaCaducidad() + ", getNumLote()=" + getNumLote() + "]";
	}

	public static void main(String[] args) {
		
		ProductosRefrigerados refri1 = new ProductosRefrigerados(LocalDate.of(2024, 12, 12), 20, "Aprov");
		System.out.println(refri1.toString());
		
	}
}
