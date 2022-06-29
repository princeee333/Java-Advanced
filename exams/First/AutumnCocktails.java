package exams.First;

import java.util.*;
import java.util.stream.Collectors;

public class AutumnCocktails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Fill deque

        ArrayDeque<Integer> ingredients = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> freshnessLevels = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        Map<String, Integer> cocktailsLevels = Map.of(
                "Pear Sour", 150,
                "The Harvest", 250,
                "Apple Hinny", 300,
                "High Fashion", 400
        );

        Map<String, Integer> cocktailsQuantity = new TreeMap<>();

        while (!ingredients.isEmpty() && !freshnessLevels.isEmpty()) {
            int ingredient = ingredients.removeFirst();
            if (ingredient == 0) {
                continue;
            }

            int freshness = freshnessLevels.removeLast();
            int totalFreshness = ingredient * freshness;

            Optional<String> cocktailOpt = cocktailsLevels.entrySet().stream()
                    .filter(kvp -> kvp.getValue() == totalFreshness)
                    .map(Map.Entry::getKey)
                    .findFirst();

            if (cocktailOpt.isPresent()) {
                cocktailsQuantity.merge(cocktailOpt.get(), 1, (k, ignored) -> k + 1);
            } else {
                ingredient = ingredient + 5;
                ingredients.addLast(ingredient);
            }
        }

        if (cocktailsQuantity.size() == 4) {
            System.out.println("It's party time! The cocktails are ready!");
        } else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
        }


        int remainingIngredientsSum = ingredients.stream().mapToInt(Integer::intValue).sum();

        if (remainingIngredientsSum > 0) {
            System.out.printf("Ingredients left: %d%n", remainingIngredientsSum);
        }

        cocktailsQuantity.entrySet().stream()
                .map(kvp -> String.format(" # %s --> %d", kvp.getKey(), kvp.getValue()))
                .forEach(System.out::println);
    }
}