package StacksAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(" ");
        ArrayDeque<String> game = new ArrayDeque<>();
        int num = Integer.parseInt(scanner.nextLine());
        int cycle = 1;
        while (game.size() > 1) {

            for (int i = 2; i < num; i++) {
                game.offer(game.poll());
            }
            System.out.println("Removed " + game.poll());

        }
        System.out.println("Last is " + game.poll());
    
    }
}

