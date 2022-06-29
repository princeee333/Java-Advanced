package StreamsFilesАndDirectories.exercise;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class GetFolderSize {
    public static void main(String[] args) throws IOException {


        File folder = new File("C:\\Users\\Princeee\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");
        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(folder);

        int sumBytes = 0;
        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            File[] nestedFiles = current.listFiles();
            for (File f : Objects.requireNonNull(nestedFiles)) {
                if (f.isDirectory()) {
                    dirs.offer(f);
                } else {
                    sumBytes += f.length();
                }
            }
        }
        System.out.println("Folder size: " + sumBytes);

    }
}
