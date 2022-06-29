package DefiningClasses.exercise.PokemonTrainer;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Trainer> mapTrainer = new LinkedHashMap<>();
        String inputLine;
        while (!"Tournament".equals(inputLine= scanner.nextLine())){
            String[] token = inputLine.split("\\s+");
            String currentTrainer = token[0];
            mapTrainer.putIfAbsent(currentTrainer, new Trainer(currentTrainer));
            Trainer trainer = mapTrainer.get(currentTrainer);
            trainer.addPokemon(new Pokemon(token[1], token[2], Integer.parseInt(token[3])));
        }
        String element;
        while (!"End".equals(element= scanner.nextLine())){
            String finalElement = element;
            mapTrainer.values().forEach(s -> s.applyCommand(finalElement));

        }
        mapTrainer.values().stream().sorted(Comparator.comparing(Trainer::getNumberOfBadges).reversed()).forEach(System.out::println);
    }
}
