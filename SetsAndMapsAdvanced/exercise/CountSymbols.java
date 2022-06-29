package SetsAndMapsAdvanced.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("");

        Map<String, Integer> mapWord = new TreeMap<>();

        for (int i = 0; i < input.length; i++) {
            String currentLetter = input[i];

            if (!mapWord.containsKey(currentLetter)) {
                mapWord.put(currentLetter, 1);
            } else {
                mapWord.put(currentLetter, mapWord.get(currentLetter) + 1);
            }

        }

        mapWord.forEach((k, v)-> System.out.printf("%s: %d time/s%n", k, v));
    }
}