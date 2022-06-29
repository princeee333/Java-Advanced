package exams.Second;

import java.util.Scanner;

public class Bee {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


       int matrixSize = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[matrixSize][matrixSize];

        int beeRow = 0;
        int beeCol = 0;
        int pollinatedFlowers = 0;

        //Запълване на матрицата
        for (int i = 0; i < matrixSize; i++) {
            String line = scanner.nextLine();
            matrix[i] = line.toCharArray();
            if (line.contains("B")) {  //М е буквата, която търсим като начална точка
                beeRow = i;
                beeCol = line.indexOf("B");
                matrix[beeRow][beeCol] = '.'; // след като открием търсената буква да сменим символа на по подразбиране
                //когато търсим само един символ няма смисъл от продължаване на проверката
            }
        }

        int currentRow = beeRow;
        int currentCol = beeCol;
        boolean outOfBound = false;
        String currentCommand = null;
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            //UP{-1;0}
            //Down{1;0}
            //Left{0;-1}
            //Right{0;1}


            matrix[beeRow][beeCol] = '.';
            switch (command) {
                case "up":
                    currentCommand = "up";
                    if (currentRow != 0) { // Проверка дали ще излезе
                        currentRow--;
                    } else {

                        System.out.println("The bee got lost!");
                        outOfBound = true;
                        break;
                    }
                    break;
                case "down":
                    currentCommand = "down";
                    if (currentRow != matrix.length - 1) {// Проверка дали ще излезе
                        currentRow++;
                    } else {

                        System.out.println("The bee got lost!");
                        outOfBound = true;
                        break;
                    }
                    break;
                case "right":
                    currentCommand = "right";
                    if (currentCol != matrix.length - 1) {// Проверка дали ще излезе
                        currentCol++;
                    } else {

                        System.out.println("The bee got lost!");
                        outOfBound = true;
                        break;
                    }
                    break;
                case "left":
                    currentCommand = "left";
                    if (currentCol != 0) {// Проверка дали ще излезе
                        currentCol--;

                    } else {

                        System.out.println("The bee got lost!");
                        outOfBound = true;
                        break;
                    }
                    break;
            }

            if (matrix[currentRow][currentCol] == 'f') {
                pollinatedFlowers++;
                matrix[currentRow][currentCol] = '.';

            } else if (matrix[currentRow][currentCol] == 'O') {
                matrix[currentRow][currentCol] = '.';
                switch (currentCommand) {
                    case "up":
                        if (currentRow != 0) { // Проверка дали ще излезе
                            currentRow--;
                        } else {

                            System.out.println("The bee got lost!");
                            outOfBound = true;
                            break;
                        }
                        break;
                    case "down":
                        if (currentRow != matrix.length - 1) {// Проверка дали ще излезе
                            currentRow++;
                        } else {

                            System.out.println("The bee got lost!");
                            outOfBound = true;
                            break;
                        }
                        break;
                    case "right":
                        if (currentCol != matrix.length - 1) {// Проверка дали ще излезе
                            currentCol++;
                        } else {

                            System.out.println("The bee got lost!");
                            outOfBound = true;
                            break;
                        }
                        break;
                    case "left":
                        if (currentCol != 0) {// Проверка дали ще излезе
                            currentCol--;

                        } else {

                            System.out.println("The bee got lost!");
                            outOfBound = true;
                            break;
                        }
                        break;
                }
                if (matrix[currentRow][currentCol] == 'f') {
                    pollinatedFlowers++;
                    matrix[currentRow][currentCol] = '.';
                }
            }

            if (outOfBound) {
                break;
            }
            command = scanner.nextLine();
        }
        if (outOfBound) {
            matrix[currentRow][currentCol] = '.';
        } else {
            matrix[currentRow][currentCol] = 'B'; //След като излеза от проверката да отбелеза мястото на което се намирам
        }


        if (pollinatedFlowers < 5) {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n", 5 - pollinatedFlowers);
        } else {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n", pollinatedFlowers);
        }


        print2dArray(matrix);
    }

    //Принтиране на матрицата
    private static void print2dArray(char[][] matrix) {
        for (char[] arr : matrix) {
            for (char c : arr) {
                System.out.print(c);
            }
            System.out.println();

        }

    }
}
