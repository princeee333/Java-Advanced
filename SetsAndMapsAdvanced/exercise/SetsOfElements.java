package SetsAndMapsAdvanced.exercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] input =Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];

        Set<Integer> firstNumbers = new LinkedHashSet<>();
        Set<Integer> secondNumbers = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            int number =Integer.parseInt(scanner.nextLine());
            firstNumbers.add(number);
        }

        for (int i = 0; i < m; i++) {
            int number =Integer.parseInt(scanner.nextLine());
            secondNumbers.add(number);
        }

        firstNumbers.retainAll(secondNumbers);

        firstNumbers.forEach(e-> System.out.print(e + " "));
    }
}
