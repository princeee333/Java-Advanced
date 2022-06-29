package StreamsFilesАndDirectories.lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";

        List<String> sortedLine = Files.readAllLines(Paths.get(path))
                .stream()
                .sorted()
                .collect(Collectors.toList());
        Path outPutPath = Path.of("sorted-line-out.txt");

        Files.createFile(outPutPath);
        Files.write(outPutPath, sortedLine, StandardOpenOption.WRITE);
    }
}
