package DefiningClasses.exercise.PokemonTrainer;

public class Pokemon {
    private String pokemonName;
    private final String element;
    private int health;

    public Pokemon(String pokemonName,String element,int health){
        this.pokemonName =pokemonName;
        this.element=element;
        this.health=health;

    }

  public void looseHealth(){
        this.health-=10;
  }

  public boolean isDead(){
        return  this.health<=0;
  }


    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public String getElement() {
        return element;
    }
}
