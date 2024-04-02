package ejercicios;

import java.time.LocalDate;

public class LargoRecorrido extends Tren{
	private boolean servicioCafeteria ;
	private int tiempoViaje;
	
	public LargoRecorrido(String origen, String destino, LocalDate fecha, boolean servicioCafeteria, int tiempoViaje) {
        super(origen, destino, fecha);
        this.servicioCafeteria = servicioCafeteria;
        this.tiempoViaje = tiempoViaje;
    }

    @Override
    public double calcularDescuento() {
        // Verificar si el viaje se produce los primeros 10 días del mes y si la duración es superior a 5 horas
        if (getFecha().getDayOfMonth() <= 10 && tiempoViaje > 5) {
            return Descuento.descuentoBase; // Devolver el descuento base
        } else {
            return Descuento.descuentoBase / 2; // Devolver la mitad del descuento base
        }
    }

    public LocalDate getFecha() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public double calcularPVP() {
        double descuento = calcularDescuento(); // Calcular el descuento
        double pvp = getTarifa() * (1 - descuento); // Calcular el PVP aplicando el descuento
        return pvp;
    }

    @Override
    public String toString() {
        return "LargoRecorrido [servicioCafeteria=" + servicioCafeteria + ", tiempoViaje=" + tiempoViaje
                + ", getTarifa()=" + getTarifa() + ", calcularDescuento()=" + calcularDescuento() + ", calcularPVP()="
                + calcularPVP() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + "]";
    }

}