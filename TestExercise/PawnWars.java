package TestExercise;

import java.util.Scanner;

public class PawnWars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[8][8];
        int whiteRow = 0;
        int whiteCol = 0;
        int blackRol = 0;
        int blackCol = 0;


        //Запълване на матрицата
        for (int i = 0; i < matrix.length; i++) {
            String line = scanner.nextLine();
            matrix[i] = line.toCharArray();
            if (line.contains("w")) {  //М е буквата, която търсим като начална точка
                whiteRow = i;
                whiteCol = line.indexOf("w");
                matrix[whiteRow][whiteCol] = '-'; // след като открием търсената буква да сменим символа на по подразбиране
                //когато търсим само един символ няма смисъл от продължаване на проверката
            } else if (line.contains("b")) {
                blackRol = i;
                blackCol = line.indexOf("b");
                matrix[blackRol][blackCol] = '-';
            }
        }
        boolean isHit = false;

        while (whiteRow != 0 && blackRol != matrix.length - 1&& !isHit) {

            if (whitePawHitBlack(whiteRow, whiteCol, blackRol, blackCol)) {
                String coordinates = findCoordinates(blackRol, blackCol);
                System.out.printf("Game over! White capture on %s.", coordinates);
                isHit = true;
            }
            whiteRow--;




            if (blackPawHitWhite(blackRol, blackCol, whiteRow, whiteCol)) {
                String coordinates = findCoordinates(whiteRow, whiteCol);
                System.out.printf("Game over! Black capture on %s.", coordinates);
                isHit = true;
            }

            blackRol++;
        }

        if (!isHit) {
            System.out.print(whiteRow == 0
                    ? "Game over! White pawn is promoted to a queen at " + findCoordinates(whiteRow, whiteCol) + "."
                    : "Game over! Black pawn is promoted to a queen at " + findCoordinates(blackRol, blackCol) + "."
            );
        }


    }

    private static void print2dArray(char[][] matrix) {
        for (char[] arr : matrix) {
            for (char c : arr) {
                System.out.print(c);
            }
            System.out.println();

        }

    }

    private static String findCoordinates(int rows, int cols) {
        char[] col = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char[] row = new char[]{'8', '7', '6', '5', '4', '3', '2', '1'};
        StringBuilder sb = new StringBuilder();
        sb.append(col[cols]).append(row[rows]);
        return sb.toString();
    }

    private static boolean blackPawHitWhite(int bRow, int bCol, int wRow, int wCol) {
        if (bRow + 1 == wRow && (bCol + 1 == wCol || bCol - 1 == wCol)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean whitePawHitBlack(int wRow, int wCol, int bRow, int bCol) {
        if (wRow - 1 == bRow && (wCol + 1 == bCol || wCol - 1 == bCol)) {
            return true;
        } else {
            return false;
        }
    }
}
