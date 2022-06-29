package StreamsFilesАndDirectories.exercise;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CountCharacter {
    public static void main(String[] args) throws IOException {
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        try(  FileReader fr = new FileReader("inputExercise.txt");

              PrintWriter printWriter =new PrintWriter("outPutExercise.txt");) {

        int oneSymbol = fr.read();

        while (oneSymbol >= 0) {
            char symbolAsChar = (char) oneSymbol;

            if (isVowel(symbolAsChar)){
                vowels++;
            }else if (isPunctuation(symbolAsChar)){
                punctuation++;
            }else if (!Character.isWhitespace(symbolAsChar)){
                consonants++;
            }

            oneSymbol = fr.read();
        }
        printWriter.println("Vowels: " + vowels);
        printWriter.println("Consonants: " + consonants);
        printWriter.println("Punctuation: " + punctuation);
    }
    }
    public static boolean isVowel(char character){
        return character =='a'||character =='o'||character =='u'||character =='e'||character =='i';
    }

    public static boolean isPunctuation(char character){
        return character =='!'||character =='.'||character ==','||character =='?';
    }
}
