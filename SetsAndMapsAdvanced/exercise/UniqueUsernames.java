package SetsAndMapsAdvanced.exercise;

import java.util.*;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        Set<String> uniqueUsername = new LinkedHashSet<>();

        for (int i = 0; i < input; i++) {
            String name = scanner.nextLine();

            uniqueUsername.add(name);


        }
        for (String e:uniqueUsername) {
            System.out.println(e);
        }
    }
}
