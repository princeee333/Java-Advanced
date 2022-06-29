package MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = readMatrix(size, size, scanner, " ");

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (col == row) {
                    System.out.print(matrix[row][col] + " ");
                }
            }

        }
        System.out.println();
        for (int row = matrix.length-1; row>=0; row--) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row+col == size-1) {
                    System.out.print(matrix[row][col] + " ");
                }
            }

        }
    }

    public static int[] readArray(String line, String pattern) {
        return Arrays.stream(line.split(pattern)).mapToInt(Integer::parseInt).toArray();

    }

    public static int[][] readMatrix(int rows, int cows, Scanner scanner, String pattern) {
        int matrix[][] = new int[rows][cows];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner.nextLine(), pattern);
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
}
