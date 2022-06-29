package StacksAndQueues.exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int S = scanner.nextInt();
        int X = scanner.nextInt();

        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            stack.offer(scanner.nextInt());
        }

        for (int i = 0; i < S; i++) {
            stack.poll();
        }
        if (stack.isEmpty()) {
            System.out.println("0");
        }else {
            if (stack.contains(X)) {
                System.out.println("true");
            } else {
                System.out.println(Collections.min(stack));
            }
        }
    }
}

