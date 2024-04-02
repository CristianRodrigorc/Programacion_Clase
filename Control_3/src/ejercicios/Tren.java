package ejercicios;

import java.time.LocalDate;

public abstract class Tren implements Descuento{
	private String origen;
	private String destino;
	private LocalDate fecha;
	private double tarifa;
	
	public Tren(String origen, String destino, LocalDate fecha) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
		this.tarifa = 0;
		
	}
	
    // Método abstracto para calcular el PVP (Precio de Venta al Público) que debe pagar el viajero
    public abstract double calcularPVP();	
	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
    // Método para calcular el descuento aplicable a la tarifa del tren
    @Override
    public double calcularDescuento() {
        double descuento = descuentoBase * tarifa; // Calcular descuento aplicable
        return descuento;
    }

	@Override
	public String toString() {
		return "Tren [origen=" + origen + ", destino=" + destino + ", fecha=" + fecha + ", tarifa=" + tarifa + "]";
	}

    public LocalDate getFecha() {
        return fecha;
    }

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
}
