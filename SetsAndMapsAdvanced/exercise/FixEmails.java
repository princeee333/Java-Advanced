package SetsAndMapsAdvanced.exercise;

import java.util.*;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String,String> fixEmail = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            String email= scanner.nextLine();

            if (email.contains(".us")||email.contains(".uk")||email.contains(".com")){

            }else {
                fixEmail.put(input,email);
            }


            input= scanner.nextLine();
        }

        fixEmail.forEach((key, value) -> System.out.println(key + " -> " + value));

    }
}
