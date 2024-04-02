package ejercicios;

public class PokemonFuego extends Pokemon {
	
	private int bonusAttack; 

	public PokemonFuego(String nombrePokemon, int healthPoints, int fuerzaDeAtaque) {
		super(nombrePokemon, healthPoints, fuerzaDeAtaque);
		this.bonusAttack = 2;
	}

}
