package arrayList;

import java.util.ArrayList;

public class ListaTareas {
	public static void main(String[] args) {
		
		ArrayList <String> tareasPendientes = new ArrayList<>();
		tareasPendientes.add("Pan");
		tareasPendientes.add("Leche");
		tareasPendientes.add("Café");
//		tareasPendientes.remove("Leche");
		tareasPendientes.remove(1);
		tareasPendientes.add(0,"Café");
		System.out.println("Contiene Café: " + tareasPendientes.contains("Café"));
		
		
		for (int i = 0; i < tareasPendientes.size(); i++) {
			System.out.println((i+1)+". "+tareasPendientes.get(i));
		}
	}
}
