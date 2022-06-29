package StreamsFilesАndDirectories.exercise;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException{
        Path words = Paths.get("C:\\Users\\Princeee\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");
        Path text = Paths.get("C:\\Users\\Princeee\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");
        String results = "outPutExercise.txt";

        PrintWriter writer = new PrintWriter(new FileWriter(results));
        Map<String, Integer> wordsInFile = new HashMap<>();
        Arrays.stream(Files.readString(words).split("\\s+")).forEach(s -> wordsInFile.put(s, 0));
        Arrays.stream(Files.readString(text).split("\\s+"))
                .forEach(s -> {
                    if(wordsInFile.containsKey(s)) {
                        wordsInFile.put(s, wordsInFile.get(s)+1);
                    }
                });
        wordsInFile.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(s -> writer.println(s.getKey() + " - " + s.getValue()));
        writer.close();
    }
}