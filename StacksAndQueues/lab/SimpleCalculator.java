package StacksAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input =scanner.nextLine().split("\\s+");

        ArrayDeque<String> calculator = new ArrayDeque<>();
        Collections.addAll(calculator,input);
        while (calculator.size()>1){
            int firstNumber = Integer.valueOf(calculator.pop());
            String operation =calculator.pop();
            int secondNumber = Integer.valueOf(calculator.pop());

            if (operation.equals("+")){
                calculator.push(String.valueOf(firstNumber+secondNumber));
            }else {
                calculator.push(String.valueOf(firstNumber-secondNumber));
            }


        }
        System.out.println(String.valueOf(calculator.pop()));
    }
}
