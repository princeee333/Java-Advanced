package FunctionalProgramming.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMinFunction {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        Function<Integer[], Integer> maxElement= intArr->Arrays.stream(intArr).sorted().findFirst().orElse(0);
        System.out.println(maxElement.apply(Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new)));

        }
}
