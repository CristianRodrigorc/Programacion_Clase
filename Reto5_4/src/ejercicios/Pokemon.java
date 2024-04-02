package ejercicios;

public class Pokemon {
	private String nombrePokemon;
	private int healthPoints;
	private int fuerzaDeAtaque;
	private int comprobarVida;
	
	public Pokemon(String nombrePokemon, int healthPoints, int fuerzaDeAtaque) {
		this.nombrePokemon = nombrePokemon;
		this.healthPoints = healthPoints;
		this.fuerzaDeAtaque = fuerzaDeAtaque;
		this.comprobarVida = healthPoints;
	}


	public String getNombrePokemon() {
		return nombrePokemon;
	}


	public void setNombrePokemon(String nombrePokemon) {
		this.nombrePokemon = nombrePokemon;
	}


	public int getHealthPoints() {
		return healthPoints;
	}


	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}


	public int getFuerzaDeAtaque() {
		return fuerzaDeAtaque;
	}


	public void setFuerzaDeAtaque(int fuerzaDeAtaque) {
		this.fuerzaDeAtaque = fuerzaDeAtaque;
	}
	
	public boolean isDead (Pokemon pokemon) {
		if(pokemon.healthPoints == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void atacar(Pokemon pokemon1, Pokemon pokemon2) {
		if (isDead(pokemon1) == false && isDead(pokemon2) == false) {
			pokemon2.healthPoints = pokemon2.healthPoints-pokemon1.fuerzaDeAtaque ;
			if(isDead(pokemon1) == false && isDead(pokemon2) == false) {
				pokemon1.healthPoints = pokemon1.healthPoints-pokemon2.fuerzaDeAtaque ;
				atacar(pokemon1, pokemon2);
			}else if(isDead(pokemon1) == false && isDead(pokemon2) == true) {
				System.out.println("No es posible atacar... "+ pokemon1 + "Está muerto");
			}
		}else if(isDead(pokemon1) == true && isDead(pokemon2) == false) {
			System.out.println("No es posible atacar... "+ pokemon1.nombrePokemon + "está muerto");
		}else if(isDead(pokemon1) == false && isDead(pokemon2) == true) {
			System.out.println("No es posible atacar... "+ pokemon2.nombrePokemon + "está muerto");
		}
	}
	
	public void pokedex(Pokemon pokemon1) {
		System.out.println(pokemon1.toString());
	}

	
	
	@Override
	public String toString() {
		return "Pokemon [nombrePokemon=" + nombrePokemon + ", healthPoints=" + healthPoints + ", fuerzaDeAtaque="
				+ fuerzaDeAtaque + "]";
	}
	
	
}
