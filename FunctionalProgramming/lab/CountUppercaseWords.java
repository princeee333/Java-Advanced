package FunctionalProgramming.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> startWithUpperCase = w -> Character.isUpperCase(w.charAt(0));

        List<String> upperCase = Arrays.stream(scanner.nextLine().split(" "))
                .filter(startWithUpperCase).toList();
        System.out.println(upperCase.size());

        Consumer<String> printer = System.out::println;

        upperCase.forEach(printer);


    }
}
