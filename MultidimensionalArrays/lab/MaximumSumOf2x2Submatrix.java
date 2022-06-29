package MultidimensionalArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCol = readArray(scanner.nextLine(), ", ");

        int rows = rowsAndCol[0];
        int cols = rowsAndCol[1];
        int [][]matrix = readMatrix(rows, cols,scanner, ", ");

        int maxSum = 0;
        int bestRow=0;
        int bestCol=0;

        for (int row =  0; row <matrix.length-1 ; row++) {
            for (int col = 0; col <matrix[row].length-1 ; col++) {
                int sum=
            matrix[row][col]+
            matrix[row][col+1]+
            matrix[row+1][col]+
            matrix[row+1][col+1];
                if (sum>maxSum){
                    maxSum=sum;
                    bestRow=row;
                    bestCol=col;
                }
            }
        }
        System.out.print(matrix[bestRow][bestCol]+" ");
        System.out.println(matrix[bestRow][bestCol+1]);
        System.out.print(matrix[bestRow+1][bestCol]+" ");
        System.out.println(matrix[bestRow+1][bestCol+1]);
        System.out.println(maxSum);
    }

    public static int[] readArray(String line, String pattern) {
        return Arrays.stream(line.split(pattern)).mapToInt(Integer::parseInt).toArray();

    }

    public static int[][] readMatrix(int rows, int cows, Scanner scanner,String pattern) {
        int matrix[][] = new int[rows][cows];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner.nextLine(),pattern);
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
