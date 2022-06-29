package StacksAndQueues.exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int S = scanner.nextInt();
        int X = scanner.nextInt();

        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            stack.push(scanner.nextInt());
        }

        for (int i = 0; i < S; i++) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            System.out.println("0");
        }else {
            if (stack.contains(X)){
                System.out.println("true");
            }else {
                System.out.println(getMaxElementFromQueue(stack));
            }
        }
    }

    private static int getMaxElementFromQueue (ArrayDeque<Integer>queue){
        int max =Integer.MIN_VALUE;
        while (!queue.isEmpty()){
            int currentElement = queue.poll();

            if (currentElement>max){
                max=currentElement;
            }
        }
        return max;
    }
}
