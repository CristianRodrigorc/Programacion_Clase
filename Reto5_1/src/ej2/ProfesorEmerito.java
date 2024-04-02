package ej2;

public class ProfesorEmerito extends Profesor{
	private int añosEmerito = 0;

	public int getAñosEmerito() {
		return añosEmerito;
	}

	public void setAñosEmerito(int añosEmerito) {
		this.añosEmerito = añosEmerito;
	}

	@Override
	public double obtenerSalarioBase(int añosConsolidados) {
		return (super.obtenerSalarioBase(añosConsolidados));
	}


	
	
	
}
