package StacksAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(" ");
        ArrayDeque<String> queue = new ArrayDeque<>();
        int num = Integer.parseInt(scanner.nextLine());
        int cycle = 1;
        for (String child : names)
            queue.offer(child);

        while (queue.size() > 1) {

            for (int i = 1; i < num; i++) {
                queue.offer(queue.poll());
            }
            if (cycle == 1) {
                System.out.println("Prime " + queue.peek());
                cycle++;
                continue;
            }
            if (cycle % 2 == 0) {

                System.out.println("Prime " + queue.peek());

            } else {

                System.out.println("Removed " + queue.pollFirst());


            }
            cycle++;
        }
        System.out.println("Last is " + queue.poll());
    }
}
