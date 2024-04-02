package ejercicios;

public class PokemonAgua extends Pokemon{

	private int bonusAttack; 
	
	public PokemonAgua(String nombrePokemon, int healthPoints, int fuerzaDeAtaque) {
		super(nombrePokemon, healthPoints, fuerzaDeAtaque);
		this.bonusAttack = 2;
	}

}
