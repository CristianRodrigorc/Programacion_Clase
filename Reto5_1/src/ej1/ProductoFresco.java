package ej1;

import java.time.LocalDate;

public class ProductoFresco extends Productos {
	
	private LocalDate fechaEnvasado = null;
	private String paisOrigen = "";
	public ProductoFresco(LocalDate fechaCaducidad, int numLote, LocalDate fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, numLote);
		this.setFechaEnvasado(fechaEnvasado);
		this.setPaisOrigen(paisOrigen);
	}
	

	public String getPaisOrigen() {
		return paisOrigen;
	}


	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}


	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}


	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	

	@Override
	public String toString() {
		return "ProductoFresco [fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen
				+ ", getFechaCaducidad()=" + getFechaCaducidad() + ", getNumLote()=" + getNumLote() + "]";
	}


	public static void main(String[] args) {
		
		ProductoFresco fresco1 = new ProductoFresco (LocalDate.of(2024, 12, 12), 10, LocalDate.of(2024, 10, 10), "Bélgica");
		
		System.out.println(fresco1.toString());
	}
}
