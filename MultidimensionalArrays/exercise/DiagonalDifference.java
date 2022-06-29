package MultidimensionalArrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();

        int[][] matrix = new int[size][size];
        fillMatrix(matrix, size, scanner);

        int sumOfPrimaryDiagonal = getSumOfPrimaryDiagonal(matrix, size);
        int sumOfSecondaryDiagonal = getSumOfSecondaryDiagonal(matrix, size);


        int sum = Math.abs(sumOfPrimaryDiagonal-sumOfSecondaryDiagonal);
        System.out.println(sum);


    }

    private static int getSumOfSecondaryDiagonal(int[][] matrix, int size) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (col == row) {
                    sum += matrix[col][row];
                }
            }
        }
        return sum;

    }

    private static int getSumOfPrimaryDiagonal(int[][] matrix, int size) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row+col == size-1) {
                    sum += matrix[col][row];
                }
            }
        }
        return sum;
    }

    private static void fillMatrix(int[][] matrix, int size, Scanner scanner) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
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
