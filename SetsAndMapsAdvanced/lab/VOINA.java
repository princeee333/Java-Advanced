package SetsAndMapsAdvanced.lab;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VOINA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstDeck = readDeck(scanner.nextLine());
        LinkedHashSet<Integer> secondDeck = readDeck(scanner.nextLine());
        int round = 50;

        while (round-- > 0) {
            int firstCard = getFirstCard(firstDeck);
            ;
            int secondCard = getFirstCard(secondDeck);
            ;
            firstDeck.remove(firstCard);
            secondDeck.remove(secondCard);

            if (firstCard > secondCard) {
                firstDeck.add(firstCard);
                firstDeck.add(secondCard);
            } else if (secondCard > firstCard) {
                secondDeck.add(firstCard);
                secondDeck.add(secondCard);
            }
            if (firstDeck.isEmpty() || secondDeck.isEmpty()) {
                break;
            }
        }
        if (firstDeck.size() > secondDeck.size()) {
            System.out.println("First player win!");
        } else if (firstDeck.size() < secondDeck.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }

    }

    public static int getFirstCard(LinkedHashSet<Integer> set) {
        return set.stream().findFirst().orElse(0);
    }

    private static LinkedHashSet<Integer> readDeck(String nextLine) {
        return Arrays.stream(nextLine.split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

    }

}
