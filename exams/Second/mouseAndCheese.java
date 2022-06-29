package exams.Second;

import java.util.Scanner;

public class mouseAndCheese {
    private static int row = 0;
    private static int col = 0;
    private static int eatenCheese = 0;
    private static boolean mouseInField = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[size][size];

        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            field[i] = line.toCharArray();

            //Откриване на началната точка:
            if (line.contains("M")) {
                row = i;
                col = line.indexOf("M");
            }
        }


        String command = scanner.nextLine();


        while (!command.equals("end")) {
//UP{-1;0}
//Down{1;0}
//Left{0;-1}
//Right{0;1}


            if (command.equals("up")) {
                moveMouse(field, -1, 0);
            } else if (command.equals("down")) {
                moveMouse(field, +1, 0);
            } else if (command.equals("left")) {
                moveMouse(field, 0, -1);
            } else if (command.equals("right")) {
                moveMouse(field, 0, +1);

            }
            if (!mouseInField) {
                break;
            }
            command = scanner.nextLine();
        }


        if (!mouseInField) {
            System.out.println("Where is the mouse?");
        }


        if (eatenCheese >= 5) {
            System.out.println("Great job, the mouse is fed " + eatenCheese + " cheeses!");
        } else {
            System.out.println("The mouse couldn't eat the cheeses, she needed " + (5 - eatenCheese) + " cheeses more.");
        }
        print2dArray(field);

    }


    private static void moveMouse(char[][] field, int rowMutator, int colMutator) {
        int nextRow = row + rowMutator;
        int nextCol = col + colMutator;

        boolean isBonusHit = false;

        if (!isInBound(field, nextRow, nextCol)) {

            field[row][col] = '-';
            mouseInField = false;
            return;
        }

        if (field[nextRow][nextCol] == 'c') {
            eatenCheese++;
        } else if (field[nextRow][nextCol] == 'B') {
            isBonusHit = true;
        }
//местене на символа(мишката)
        field[row][col] = '-';
        field[nextRow][nextCol] = 'M';
        row = nextRow;
        col = nextCol;

        if (isBonusHit) {
            moveMouse(field, rowMutator, colMutator);
        }
    }

    //проверка дали не излиза извън границиите;
    private static boolean isInBound(char[][] field, int r, int c) {

        return r >= 0 && r < field.length && c >= 0 && c < field.length;
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
