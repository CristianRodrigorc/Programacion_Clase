package ejercicios;

import java.time.LocalDate;

public class Cercanias extends Tren{
	
	private boolean parking;
	private int numEstaciones;
	
	public Cercanias(String origen, String destino, LocalDate fecha, boolean parking, int numEstaciones) {
		super(origen, destino, fecha);
		this.parking = parking;
		this.numEstaciones = numEstaciones;
	}


    @Override
    public double calcularPVP() {
        double pvp = getTarifa() * numEstaciones; // Calcular el PVP multiplicando la tarifa por el número de estaciones
        return pvp;
    }

    @Override
    public String toString() {
        return "Cercanias [parking=" + parking + ", numEstaciones=" + numEstaciones + ", getTarifa()=" + getTarifa()
                + ", calcularDescuento()=" + calcularDescuento() + ", calcularPVP()=" + calcularPVP() + ", toString()="
                + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }
	
}
