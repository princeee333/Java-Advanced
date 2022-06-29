package StreamsFilesАndDirectories.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args)throws IOException {

        String path = "inputExercise.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            long sum = 0;
            while (line != null) {

                char[] charactersFromLine = line.toCharArray();
                for (char singleChar:charactersFromLine
                ) {
                    sum+=singleChar;
                }

                line = bufferedReader.readLine();
            }
            System.out.println(sum);
        }


    }
}
