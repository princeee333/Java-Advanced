package FunctionalProgramming.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, String> countFormatter = list -> "Count = " + list.size();
        Function<List<Integer>, Integer> sumAllElements = l -> l.stream().mapToInt(e -> e).sum();
        Function<Integer, String> sumFormatter = s -> "Sum = " + s;

        String countOutPut = countFormatter.apply(numbers);

        int sum = sumAllElements.apply(numbers);
        String sumOutPut = sumFormatter.apply(sum);

        System.out.println(countOutPut);
        System.out.println(sumOutPut);
    }
}
