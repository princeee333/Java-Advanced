package TestExercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[size][size];

        switch (pattern) {
            case "A":
                patternA(matrix, size);
                break;
            case "B":
                patternB(matrix, size);
                break;
        }

        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int element : ints) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void patternA(int[][] matrix, int size) {
        int count = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[j][i] = count++;
            }
        }
    }

    public static void patternB(int[][] matrix, int size) {
        int count = 1;

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < size; j++) {
                    matrix[j][i] = count++;
                }
            } else {
                for (int j = size - 1; j >= 0; j--) {

                    matrix[j][i] = count++;
                }
            }

        }
    }
}
