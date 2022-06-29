package exams;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[size][size];

        for (int i = 0; i < size; i++) {
            field[i] = scanner.nextLine().toCharArray();
        }

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.equals("up")) {

            } else if (command.equals("down")) {

            } else if (command.equals("left")) {

            } else if (command.equals("right")) {


            }

            scanner.nextLine();
        }





    }

    private static void print2dArray(char[][] field) {
        for (char[] arr : field) {
            for (char c : arr) {
                System.out.print(c);
            }
            System.out.println();

        }

    }
}

