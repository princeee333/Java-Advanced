package StacksAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();
        String command = scanner.nextLine();
        while (!command.equals("print")) {
            String previous = command;
            if (command.equals("cancel")) {

                if (!queue.isEmpty()){
                    System.out.printf("Canceled %s%n", queue.peekFirst());
                    queue.pollFirst();
            } else {
                System.out.println("Printer is on standby");
            }

            }else {
                queue.offer(command);

            }


            command = scanner.nextLine();
        }
        for (String e:queue
             ) {
            System.out.println(queue.pop());
        }
    }
}
