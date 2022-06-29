package StreamsFilesАndDirectories.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {
    public static void main(String[] args) throws IOException {

        String path = "inputExercise.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                long sum = 0;
                char[] charactersFromLine = line.toCharArray();
                for (char singleChar:charactersFromLine
                ) {
                sum+=singleChar;
                }
                System.out.println(sum);
                line = bufferedReader.readLine();
            }
        }


    }
}
