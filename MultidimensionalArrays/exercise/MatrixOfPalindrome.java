package MultidimensionalArrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCols = readArray(scanner.nextLine());
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        String[][] matrix = new String[rows][cols];
        char startingLetter = 'a';
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                String palindrome = "" + startingLetter + (char) (startingLetter + col) + startingLetter;

                matrix[row][col] = palindrome;
            }
            startingLetter = (char)(startingLetter+1);
        }
        printMatrix(matrix);
    }

    public static int[] readArray(String line) {
        return Arrays.stream(line.split("\\s++")).mapToInt(Integer::parseInt).toArray();

    }

    public static void printMatrix(String[][] matrix) {
        for (String[] e : matrix) {
            for (String element : e) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
