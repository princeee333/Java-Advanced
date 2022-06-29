package MultidimensionalArrays.exercise;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[size][size];

        if (pattern.equals("A")) {
            patternA(matrix, size);


        } else if (pattern.equals("B")) {
            patternB(matrix, size);

        }
        printMatrix(matrix);
    }

    private static void patternA(int[][] matrix, int size) {

        int startNum = 1;
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] = startNum++;
            }
        }
    }

    private static void patternB(int[][] matrix, int size) {

        int startNum = 1;
        for (int col = 0; col < size; col++) {

            if (col % 2 == 0) {
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = startNum++;
                }
            } else {
                for (int row1 = size - 1; row1 >= 0; row1--) {
                    matrix[row1][col] = startNum++;
                }
            }
        }
    }
    public static void printMatrix ( int[][] matrix){
        for (int[] ints : matrix) {
            for (int element : ints) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
