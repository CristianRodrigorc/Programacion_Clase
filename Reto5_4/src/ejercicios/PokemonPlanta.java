package ejercicios;

public class PokemonPlanta extends Pokemon{
	
	private int bonusAttack; 
	
	public PokemonPlanta(String nombrePokemon, int healthPoints, int fuerzaDeAtaque) {
		super(nombrePokemon, healthPoints, fuerzaDeAtaque);
		this.bonusAttack = 2;
	}

}
