package SetsAndMapsAdvanced.exercise;

import java.lang.reflect.Array;
import java.util.*;

public class PeriodicTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> chemicalHash = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] chemical = scanner.nextLine().split(" ");

            chemicalHash.addAll(Arrays.asList(chemical));
        }
        for (String element:chemicalHash) {
            System.out.print(element + " ");
        }
    }
}