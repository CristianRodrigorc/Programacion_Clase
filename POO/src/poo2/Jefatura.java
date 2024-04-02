package poo2;

public class Jefatura extends Empleado implements Jefes{
	
	private double incentivo;

	public Jefatura(String nombre, double sueldo, int anno, int mes, int dia) {
		super(nombre, sueldo, anno, mes, dia);
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	public double getSueldo() {
		double sueldoJefe = super.getSueldo();
		return sueldoJefe + incentivo;
	}

	public String toString() {
		return "Nombre: " + getNombre() + " Sueldo: " + getSueldo() + " Fecha alta: " + getAltaContrato();
	}

	@Override
	public String tomarDecisiones(String decision) {
		return "El jefe toma la decisión de " + decision;
	}

	public double estableceBonus(double gratificacion) {
		double prima = 2000;
		return Trabajadores.bonusBase + gratificacion + prima;
	}

//	@Override
//	public String getDescripcion() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
