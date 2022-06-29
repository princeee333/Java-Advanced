package FunctionalProgramming.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> number = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        UnaryOperator<List<Integer>> addFunction = numberList -> numberList.stream().map(el -> el + 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> subtractFunction = numberList -> numberList.stream().map(el -> el - 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiplyFunction = numberList -> numberList.stream().map(el -> el * 2).collect(Collectors.toList());
        Consumer<Integer> printer = e->System.out.printf("%d ",e);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            switch (input) {
                case "add":
                    number= addFunction.apply(number);
                    break;
                case "subtract":
                    number=subtractFunction.apply(number);
                    break;
                case "multiply":
                    number=multiplyFunction.apply(number);
                    break;
                case "print":
                   number.forEach(printer);
                    System.out.println();
                    break;
            }

            input = scanner.nextLine();

        }

    }
}
