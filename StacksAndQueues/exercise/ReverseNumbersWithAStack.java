package StacksAndQueues.exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] numbers =scanner.nextLine().split(" ");

        ArrayDeque <Integer> stack =new ArrayDeque<>();

        for (String number : numbers) {
            stack.push(Integer.parseInt(number));
        }

        for (int i = stack.size(); i >0 ; i--) {
            System.out.printf("%d ",stack.pop());
        }
    }
}
