package exams.First;

import java.util.*;
import java.util.stream.Collectors;

public class FlowerWreaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Fill deque


        ///stack --->последното влиза, първо излиза (push - добавя; pop -премахва; peek - дава стойността на последното)
        ArrayDeque<Integer> lilies = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt)
                .forEach(lilies::push);

//Queues ---> първо влиза, първо излиза(add, offer -добавя; remove,poll - премахва първото; peek - дава стойността на последното)
        ArrayDeque<Integer> roses = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        List<Integer> store = new ArrayList<>();

        int wreath = 0;

        while (!lilies.isEmpty() && !roses.isEmpty()) {
            int sum = lilies.peek() + roses.peek();

            if (sum == 15) {
                wreath++;
                lilies.pop();
                roses.poll();
            } else if (sum < 15) {
                int currentLilies = lilies.pop();
                int currentRoses = roses.remove();
                store.add(currentLilies);
                store.add(currentRoses);
            } else {
                int decrease = lilies.pop();
                lilies.push(decrease - 2);
            }

        }

        if (!store.isEmpty()) {
            int summary = store.stream().mapToInt(a -> a).sum();
            while (summary > 15) {
                summary -= 15;
                wreath++;

            }
        }

        if (wreath >= 5) {
            System.out.println("You made it, you are going to the competition with " + wreath + " wreaths!");
        } else {
            int needed = 5 - wreath;
            System.out.println("You didn't make it, you need " + needed + " wreaths more!");
        }
    }
}
