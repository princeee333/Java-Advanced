package MultidimensionalArrays.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCols = readArray(scanner.nextLine());

        int rows = rowsAndCols[0];
        int cows = rowsAndCols[1];

        int[][] matrix = readMatrix(rows, cows, scanner);

        int number = Integer.parseInt(scanner.nextLine());

        List<int[]> output = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                int current = matrix[row][col];
                if (current == number) {
                    output.add(new int[]{row, col});
                }
            }

        }
        if (output.isEmpty()) {
            System.out.println("not found");
        } else {
            for (int[] indexes : output) {
                System.out.println(indexes[0] + " " + indexes[1]);
            }
        }
    }



    public static int[] readArray(String line) {
        return Arrays.stream(line.split("\\s++")).mapToInt(Integer::parseInt).toArray();

    }

    public static int[][] readMatrix(int rows, int cows, Scanner scanner) {
        int matrix[][] = new int[rows][cows];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner.nextLine());
        }
        return matrix;
    }

}
