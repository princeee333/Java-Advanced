package exams.Second;

import java.util.Scanner;

public class FormulaOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int matrixSize = Integer.parseInt(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[matrixSize][matrixSize];

        int carRow = 0;
        int carCol = 0;
        int pollinatedFlowers = 0;

        //Запълване на матрицата
        for (int i = 0; i < matrixSize; i++) {
            String line = scanner.nextLine();
            matrix[i] = line.toCharArray();
            if (line.contains("P")) {  //М е буквата, която търсим като начална точка
                carRow = i;
                carCol = line.indexOf("P");
                matrix[carRow][carCol] = '.'; // след като открием търсената буква да сменим символа на по подразбиране
                //когато търсим само един символ няма смисъл от продължаване на проверката
            }
        }

        int currentRow = carRow;
        int currentCol = carCol;
        boolean finished = false;


        for (int i = 0; i < count; i++) {
            String command = scanner.nextLine();
            int oldPositionRow = currentRow;
            int oldPositionCol = currentCol;
            //UP{-1;0}
            //Down{1;0}
            //Left{0;-1}
            //Right{0;1}


            matrix[carRow][carCol] = '.';

            switch (command) {
                case "up":
                    command = "up";
                    if (currentRow != 0) { // Проверка дали ще излезе
                        currentRow--;
                    } else {
                        currentRow = matrixSize - 1;
                    }
                    break;
                case "down":
                    command = "down";
                    if (currentRow != matrixSize - 1) {// Проверка дали ще излезе
                        currentRow++;
                    } else {
                        currentRow = 0;
                    }
                    break;
                case "right":
                    command = "right";
                    if (currentCol != matrixSize - 1) {// Проверка дали ще излезе
                        currentCol++;
                    } else {
                        currentCol =0;
                    }
                    break;
                case "left":
                    command = "left";
                    if (currentCol != 0) {// Проверка дали ще излезе
                        currentCol--;

                    } else {
                        currentCol = matrixSize - 1;
                    }
                    break;
            }

            if (matrix[currentRow][currentCol] == 'B') {

                switch (command) {
                    case "up":

                        if (currentRow != 0) { // Проверка дали ще излезе
                            currentRow--;
                        } else {
                            currentRow = matrixSize - 1;
                        }
                        break;
                    case "down":

                        if (currentRow != matrixSize - 1) {// Проверка дали ще излезе
                            currentRow++;
                        } else {
                            currentRow = 0;
                        }
                        break;
                    case "right":
                        if (currentCol != matrixSize - 1) {// Проверка дали ще излезе
                            currentCol++;
                        } else {
                            currentCol = 0;
                        }
                        break;
                    case "left":
                        if (currentCol != 0) {// Проверка дали ще излезе
                            currentCol--;

                        } else {
                            currentCol = matrixSize-1;
                        }
                        break;

                }
            } else if (matrix[currentRow][currentCol] == 'T') {

                currentRow = oldPositionRow;
                currentCol = oldPositionCol;


            }

            if (matrix[currentRow][currentCol] == 'F') {
                finished = true;
            }
        }

        matrix[currentRow][currentCol] = 'P';

        if (finished) {
            System.out.println("Well done, the player won first place!");
        } else {
            System.out.println("Oh no, the player got lost on the track!");
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
