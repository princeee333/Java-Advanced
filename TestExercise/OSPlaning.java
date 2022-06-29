package TestExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OSPlaning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Fill deque


        ///stack --->последното влиза, първо излиза (push - добавя; pop -премахва; peek - дава стойността на последното)
        ArrayDeque<Integer> tasks = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt)
                .forEach(tasks::push);

//Queues ---> първо влиза, първо излиза(add, offer -добавя; remove,poll - премахва първото; peek - дава стойността на последното)
        ArrayDeque<Integer> threads = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        int valueForKill = Integer.parseInt(scanner.nextLine());

        int thread = 0;

        while (!tasks.isEmpty() && !threads.isEmpty()) {
            thread = threads.peek();
            if (valueForKill == tasks.peek()) {
                break;
            }

            if (threads.peek() >= tasks.peek()) {
                tasks.pop();
                threads.poll();
            } else {


                threads.poll();

            }

        }

        System.out.printf("Thread with value %d killed task %d%n", thread, valueForKill);
        String remainingLiquids = threads.isEmpty() ? "none" : threads.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(remainingLiquids);
    }
}
