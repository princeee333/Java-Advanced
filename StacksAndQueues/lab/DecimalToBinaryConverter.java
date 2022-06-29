package StacksAndQueues.lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque <Integer> stack =new ArrayDeque<>();
        int num =Integer.parseInt(scanner.nextLine());

        if (num==0){
            System.out.println(num);

        }else {
            while (num!=0){
                stack.push(num%2);
                num/=2;

            }

        }
            System.out.println(stack.toString().replaceAll("[\\[\\], ]",""));
    }
}
