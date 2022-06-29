package StacksAndQueues.exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCommands = scanner.nextInt();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numCommands; i++) {

          int command=scanner.nextInt();

            switch (command) {
                case 1:
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }else {
                        break;
                    }
                    break;
                case 3:
                   if (!stack.isEmpty()){
                    System.out.println(Collections.max(stack));
                   }
                    break;
            }
        }
    }
}