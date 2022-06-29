package exams.Second;

import java.util.Scanner;

public class Python {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int size = Integer.parseInt(scanner.nextLine());

        int snakeRow = 0;
        int snakeCol = 0;
        int pythonLength = 1;
        int foodOnField = 0;
        String[][] matrix = new String[size][size];
        ;
        String[] commands = scanner.nextLine().split(", ");
        //Запълване на матрицата


        for (int i = 0; i < size; i++) {
            String input = scanner.nextLine();
            matrix[i] = input.split("\\s+");
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("s")) {
                    matrix[i][j] = "*";
                    snakeRow = i;
                    snakeCol = j;
                }

                if (matrix[i][j].equals("f")) {
                    foodOnField++;
                }
            }
        }

        int currentRow = snakeRow;
        int currentCol = snakeCol;
        boolean win = true;


        for (int i = 0; i < commands.length; i++) {
            String currentCommand = commands[i];


            switch (currentCommand) {
                case "up":

                    if (currentRow != 0) { // Проверка дали ще излезе
                        currentRow--;
                    } else {
                        currentRow = size - 1;
                    }
                    break;
                case "down":

                    if (currentRow != size - 1) {// Проверка дали ще излезе
                        currentRow++;
                    } else {
                        currentRow = 0;
                    }
                    break;
                case "right":
                    if (currentCol != size - 1) {// Проверка дали ще излезе
                        currentCol++;
                    } else {
                        currentCol = 0;
                    }
                    break;
                case "left":
                    if (currentCol != 0) {// Проверка дали ще излезе
                        currentCol--;

                    } else {
                        currentCol = size - 1;
                    }
                    break;

            }


            if (matrix[currentRow][currentCol].equals("f")) {
                pythonLength++;
                foodOnField--;
                matrix[currentRow][currentCol] = "*";
            }

            if (matrix[currentRow][currentCol].equals("e")) {
                win = false;
                System.out.println("You lose! Killed by an enemy!");
                break;
            }
        }


        if (win && foodOnField > 0) {

            System.out.println("You lose! There is still " + foodOnField + " food to be eaten.");

        } else if (win) {

            System.out.println("You win! Final python length is " + pythonLength);
        }
    }

    private static void print2dArray(String[][] matrix, int size) {
        String[][] matrix1 = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < matrix1[size].length; j++) {
                System.out.println(matrix1[i][j]);
            }
            System.out.println();
        }

    }
}
