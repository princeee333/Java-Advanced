package MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndCows = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int rows = rowsAndCows[0];
        int cols = rowsAndCows[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] tokens = scanner.nextLine().split(", ");
            for (int col = 0; col < tokens.length; col++) {

                matrix[row][col] = Integer.parseInt(tokens[col]);
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(getElementSum(matrix));

    }

    private static int getElementSum(int[][] matrix) {
        return Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();
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
