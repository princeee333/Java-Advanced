package SetsAndMapsAdvanced.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> phonebook = new HashMap<>();
        while (!input.equals("search")) {

            String[] tokens = input.split("-");
            phonebook.put(tokens[0], tokens[1]);
            input = scanner.nextLine();

        }
        input = scanner.nextLine();
        while (!input.equals("stop")) {
            String[] tokens = input.split("-");

            if (phonebook.containsKey(tokens[0])) {
                System.out.println(tokens[0] + " -> " + phonebook.get(tokens[0]));

            } else {
                System.out.printf("Contact %s does not exist.%n", tokens[0]);

            }

            input = scanner.nextLine();
        }

    }
}
