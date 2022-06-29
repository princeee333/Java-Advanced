package MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] rowsAndCols = readArray(scanner.nextLine());

        int rows = rowsAndCols[0];
        int cows = rowsAndCols[1];

        int[][] firstMatrix = readMatrix(rows, cows, scanner);

        rowsAndCols = readArray(scanner.nextLine());
        rows = rowsAndCols[0];
        cows = rowsAndCols[1];

        int[][] secondMatrix = readMatrix(rows, cows, scanner);


        if (matricesAreEqual(firstMatrix, secondMatrix)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }

    public static boolean matricesAreEqual(int[][] first, int[][] second) {
        if (first.length != second.length) {
            return false;
        }

        for (int row = 0; row < first.length; row++) {
            int[] firstArray = first[row];
            int[] secondArray = second[row];

            if (firstArray.length != secondArray.length) {
                return false;
            }
            for (int col = 0; col < firstArray.length; col++) {
                if (firstArray[col] != secondArray[col]) {
                    return false;
                }
            }
        }

        return true;

    }

    public static int[][] readMatrix(int rows, int cows, Scanner scanner) {
        int matrix[][] = new int[rows][cows];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner.nextLine());
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int element : ints) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int[] readArray(String line) {
        return Arrays.stream(line.split("\\s++")).mapToInt(Integer::parseInt).toArray();

    }


}