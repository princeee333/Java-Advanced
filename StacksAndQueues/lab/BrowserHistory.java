package StacksAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        String input = scanner.nextLine();

        String currentPage = "";
        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (browserHistory.isEmpty()) {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                }
                String prevURL = browserHistory.pop();
                currentPage = prevURL;

            } else {
                if (!currentPage.equals("")) {
                    browserHistory.push(currentPage);
                }
                currentPage = input;
            }


            System.out.println(currentPage);
            input = scanner.nextLine();
        }
    }
}

