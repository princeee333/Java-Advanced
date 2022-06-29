package Exam;

import java.util.*;
import java.util.stream.Collectors;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Queues ---> първо влиза, първо излиза(add, offer -добавя; remove,poll - премахва първото; peek - дава стойността на последното)
        ArrayDeque<Double> milkValue = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ///stack --->последното влиза, първо излиза (push - добавя; pop -премахва; peek - дава стойността на последното)
        ArrayDeque<Double> cacaoPower = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble)
                .forEach(cacaoPower::push);


        Map<String, Integer> store = new TreeMap<>();

        while (!milkValue.isEmpty() && !cacaoPower.isEmpty()) {

            double sum = cacaoPower.peek() + milkValue.peek();
            int result = (int) Math.round(cacaoPower.peek() * 100 / sum);

            if (result == 30 || result == 50 || result == 100) {
                milkValue.poll();
                cacaoPower.pop();
                switch (result) {

                    case 30:
                        String milkChocolate = "Milk Chocolate";
                        if (!store.containsKey(milkChocolate)) {
                            store.put(milkChocolate, 1);
                        } else {
                            store.put(milkChocolate, store.get(milkChocolate) + 1);
                        }
                        break;

                    case 50:
                        String darkChocolate = "Dark Chocolate";
                        if (!store.containsKey(darkChocolate)) {
                            store.put(darkChocolate, 1);
                        } else {
                            store.put(darkChocolate, store.get(darkChocolate) + 1);
                        }

                        break;

                    case 100:
                        String bakingChocolate = "Baking Chocolate";
                        if (!store.containsKey(bakingChocolate)) {
                            store.put(bakingChocolate, 1);
                        } else {
                            store.put(bakingChocolate, store.get(bakingChocolate) + 1);
                        }
                        break;

                }

            } else {
                cacaoPower.pop();
                double increaseMilk = milkValue.poll() + 10;
                milkValue.addLast(increaseMilk);
            }
        }

        if (store.size() == 3) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");



        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }
        store.forEach((key, value) -> System.out.println("# " + key + " --> " + value));
    }
}