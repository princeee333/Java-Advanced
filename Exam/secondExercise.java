package Exam;

import java.util.Scanner;

public class secondExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[matrixSize][matrixSize];

        int dillingerRow = 0;
        int dillingerCol = 0;
        int houseInField = 0;

        String[] commands = scanner.nextLine().split(",");
        //Запълване на матрицата
        for (int i = 0; i < matrixSize; i++) {
            String input = scanner.nextLine();
            matrix[i] = input.split("\\s+");
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("D")) {
                    matrix[i][j] = "+";
                    dillingerRow = i;
                    dillingerCol = j;
                } else if (matrix[i][j].equals("$")) {
                    houseInField++;
                }
            }
        }
        int currentRow = dillingerRow;
        int currentCol = dillingerCol;
        int totalStolenSum = 0;
        boolean policeCatch = false;
        for (int k = 0; k < commands.length; k++) {
            String command = commands[k];


            switch (command) {
                case "up":

                    if (currentRow != 0) { // Проверка дали ще излезе
                        currentRow--;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                        break;
                    }
                    break;
                case "down":

                    if (currentRow != matrix.length - 1) {// Проверка дали ще излезе
                        currentRow++;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                        break;
                    }
                    break;
                case "right":

                    if (currentCol != matrix.length - 1) {// Проверка дали ще излезе
                        currentCol++;
                    } else {

                        System.out.println("You cannot leave the town, there is police outside!");
                        break;
                    }
                    break;
                case "left":

                    if (currentCol != 0) {// Проверка дали ще излезе
                        currentCol--;

                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                        break;
                    }
                    break;
            }

            if (matrix[currentRow][currentCol].equals("$")) {
                matrix[currentRow][currentCol] = "+";
                int totalSum = currentRow * currentCol;
                totalStolenSum += totalSum;
                System.out.println("You successfully stole " + totalSum + "$.");
                houseInField--;
            } else if (matrix[currentRow][currentCol].equals("P")) {
                matrix[currentRow][currentCol] = "#";

                System.out.println("You got caught with " + totalStolenSum + "$, and you are going to jail.");
                print2dArray(matrix);
                policeCatch = true;

                break;
            }
        }

        if (!policeCatch) {
            matrix[currentRow][currentCol] = "D";
            System.out.println("Your last theft has finished successfully with " + totalStolenSum + "$ in your pocket.");
            print2dArray(matrix);
        }


    }

    private static void print2dArray(String[][] matrix) {
        int currentArray=  matrix.length;
        for (String[] arr : matrix) {
            for (String c : arr) {
              currentArray--;


                if (currentArray >= 1) {
                    System.out.print(c + " ");
                } else {
                    System.out.print(c);
                }


            }
            currentArray= matrix.length;
            System.out.println();
        }
    }
}