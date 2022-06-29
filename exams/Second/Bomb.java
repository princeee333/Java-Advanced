package exams.Second;

import java.util.Scanner;

public class Bomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());
        //   String[] command = scanner.nextLine().split(",");


        char[][] matrix = new char[matrixSize][matrixSize];

        int sapperRow = 0;
        int sapperCol = 0;
        int mouseCheese = 0;

        //Запълване на матрицата
        for (int i = 0; i < matrixSize; i++) {
            String line = scanner.nextLine();
            matrix[i] = line.toCharArray();
            if (line.contains("M")) {  //М е буквата, която търсим като начална точка
                sapperRow = i;
                sapperCol = line.indexOf("M");
                matrix[sapperRow][sapperCol] = '-'; // след като открием търсената буква да сменим символа на по подразбиране
                //когато търсим само един символ няма смисъл от продължаване на проверката
            }
        }

        int currentRow = sapperRow;
        int currentCol = sapperCol;
        boolean outOfBound = false;
        String currentCommand = null;
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            //UP{-1;0}
            //Down{1;0}
            //Left{0;-1}
            //Right{0;1}


            matrix[sapperRow][sapperCol] = '-';
            switch (command) {
                case "up":
                    currentCommand = "up";
                    if (currentRow != 0) { // Проверка дали ще излезе
                        currentRow--;
                    } else {

                        System.out.println("Where is the mouse?");
                        outOfBound = true;
                        break;
                    }
                    break;
                case "down":
                    currentCommand = "down";
                    if (currentRow != matrix.length - 1) {// Проверка дали ще излезе
                        currentRow++;
                    } else {

                        System.out.println("Where is the mouse?");
                        outOfBound = true;
                        break;
                    }
                    break;
                case "right":
                    currentCommand = "right";
                    if (currentCol != matrix.length - 1) {// Проверка дали ще излезе
                        currentCol++;
                    } else {

                        System.out.println("Where is the mouse?");
                        outOfBound = true;
                        break;
                    }
                    break;
                case "left":
                    currentCommand = "left";
                    if (currentCol != 0) {// Проверка дали ще излезе
                        currentCol--;

                    } else {

                        System.out.println("Where is the mouse?");
                        outOfBound = true;
                        break;
                    }
                    break;
            }

            if (matrix[currentRow][currentCol] == 'c') {
                mouseCheese++;
                matrix[currentRow][currentCol] = '-';

            } else if (matrix[currentRow][currentCol] == 'B') {
                matrix[currentRow][currentCol] = '-';
                switch (currentCommand) {
                    case "up":
                        if (currentRow != 0) { // Проверка дали ще излезе
                            currentRow--;
                        } else {

                            System.out.println("Where is the mouse?");
                            outOfBound = true;
                            break;
                        }
                        break;
                    case "down":
                        if (currentRow != matrix.length - 1) {// Проверка дали ще излезе
                            currentRow++;
                        } else {

                            System.out.println("Where is the mouse?");
                            outOfBound = true;
                            break;
                        }
                        break;
                    case "right":
                        if (currentCol != matrix.length - 1) {// Проверка дали ще излезе
                            currentCol++;
                        } else {

                            System.out.println("Where is the mouse?");
                            outOfBound = true;
                            break;
                        }
                        break;
                    case "left":
                        if (currentCol != 0) {// Проверка дали ще излезе
                            currentCol--;

                        } else {

                            System.out.println("Where is the mouse?");
                            outOfBound = true;
                            break;
                        }
                        break;
                }
                if (matrix[currentRow][currentCol] == 'c') {
                    mouseCheese++;
                    matrix[currentRow][currentCol] = '-';
                }
            }

            if (outOfBound) {
                break;
            }
            command = scanner.nextLine();
        }
        if (outOfBound) {
            matrix[currentRow][currentCol] = '-';
        } else {
            matrix[currentRow][currentCol] = 'M'; //След като излеза от проверката да отбелеза мястото на което се намирам
        }


        if (mouseCheese < 5) {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n", 5 - mouseCheese);
        } else {
            System.out.printf("Great job, the mouse is fed %d cheeses!%n", mouseCheese);
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
