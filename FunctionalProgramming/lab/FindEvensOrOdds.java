package FunctionalProgramming.lab;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class FindEvensOrOdds {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] range = scanner.nextLine().split("\\s+");
        int start = Integer.parseInt(range[0]);
        int end = Integer.parseInt(range[1]);

        String operation = scanner.nextLine();
        IntPredicate evenOrOdd = "odd".equals(operation) ? i -> i % 2 != 0 : i -> i % 2 == 0;

    }
}