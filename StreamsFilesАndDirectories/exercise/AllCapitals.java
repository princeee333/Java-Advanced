package StreamsFilesАndDirectories.exercise;

import java.io.*;



public class AllCapitals {
    public static void main(String[] args)throws IOException {


        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Princeee\\JavaAdvance\\inputExercise.txt"));
        PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\Princeee\\JavaAdvance\\outPutExercise.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            line = line.toUpperCase();
            writer.println(line);
        }
        writer.close();
    }
}
