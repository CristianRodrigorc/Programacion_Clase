package ejercicios;

import java.time.LocalDate;

public class Turistico extends Tren{
    private String nombreTuristico;

    public Turistico(String origen, String destino, LocalDate fecha, String nombreTuristico) {
        super(origen, destino, fecha);
        this.nombreTuristico = nombreTuristico;
    }

    @Override
    public double calcularDescuento() {
        // Si el viaje sale de Aranjuez, se aplica el descuento base definido en la interfaz Descuento
        if (getOrigen().equalsIgnoreCase("Aranjuez")) {
            return Descuento.descuentoBase;
        } else {
            return 0; // Si el viaje no sale de Aranjuez, el descuento es 0
        }
    }


	@Override
    public double calcularPVP() {
        double descuento = calcularDescuento(); // Obtener el descuento a aplicar
        double pvp = getTarifa() * (1 - descuento); // Calcular el PVP aplicando el descuento
        return pvp;
    }

    @Override
    public String toString() {
        return "Turistico [nombreTuristico=" + nombreTuristico + ", getTarifa()=" + getTarifa()
                + ", calcularDescuento()=" + calcularDescuento() + ", calcularPVP()=" + calcularPVP()
                + ", toString()=" + super.toString() + "]";
    }
}



