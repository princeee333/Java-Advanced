package DefiningClasses.exercise.PokemonTrainer;


import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;
    private int numberOfBadges =0;
    private List<Pokemon> collectionOfPokemon = new ArrayList<>();

    public Trainer(String name) {
        this.name = name;

    }

    public void addPokemon(Pokemon pokemon){
        this.collectionOfPokemon.add(pokemon);
    }

    public boolean hasElement(String element){
        return this.collectionOfPokemon.stream().anyMatch(s -> s.getElement().equals(element));
    }

    public void applyCommand(String element){
        if(hasElement(element)) {
            this.numberOfBadges++;
        }
        else {
            this.collectionOfPokemon.forEach(Pokemon::looseHealth);
            this.collectionOfPokemon.removeIf(Pokemon::isDead);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }

    public List<Pokemon> getCollectionOfPokemon() {
        return collectionOfPokemon;
    }

    public void setCollectionOfPokemon(List<Pokemon> collectionOfPokemon) {
        this.collectionOfPokemon = collectionOfPokemon;
    }

    @Override
    public String toString() {
        return name + " " + numberOfBadges + " " + collectionOfPokemon.size();
    }
}
