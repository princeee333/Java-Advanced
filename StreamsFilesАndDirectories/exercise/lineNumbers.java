package StreamsFilesАndDirectories.exercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class lineNumbers {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("C:\\Users\\Princeee\\JavaAdvance\\outPutExercise.txt")) {
            Path inputFile = Paths.get("C:\\Users\\Princeee\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt");
            List<String> lines = Files.readAllLines(inputFile);
            for (int i = 0; i < lines.size(); i++) {
                pw.println((i + 1) + ". " + lines.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
