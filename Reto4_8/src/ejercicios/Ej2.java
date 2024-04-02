package ejercicios;

import java.util.ArrayList;

public class Ej2 {
	public static void main(String[] args) {
		Coches coche1 = new Coches("X6J-776","Toyota","Hilux");
		Coches coche2 = new Coches("V5F-312","Nissan","X-Trail");
		Coches coche3 = new Coches("A2C-272","Toyota","Land Cruiser");
		Coches coche4 = new Coches("H6X-776","Toyota","Hilux");
		
		
		ArrayList <Coches> listaDisponible = new ArrayList ();
		listaDisponible.add(coche1);
		listaDisponible.add(coche2);
		listaDisponible.add(coche3);
		listaDisponible.add(coche4);
		
		ArrayList <Coches> listaRentados = new ArrayList ();
		
		
	}
	
	public static void darAlta(ArrayList <Coches> list) {
		
	}
	
	public static void darBaja(ArrayList <Coches> list) {
		
	}
}
