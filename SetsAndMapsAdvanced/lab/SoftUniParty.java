package SetsAndMapsAdvanced.lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> VIP =new TreeSet<>();
        TreeSet<String> regular =new TreeSet<>();
        String guess = scanner.nextLine();

        while (!guess.equals("PARTY")){


            if (Character.isDigit(guess.charAt(0))){
                VIP.add(guess);
            }else if(Character.isLetter(guess.charAt(0))){
                regular.add(guess);
            }
            guess=scanner.nextLine();
        }

        guess=scanner.nextLine();

        while (!guess.equals("END")){
            if (VIP.contains(guess)){
                VIP.remove(guess);
            }else if (regular.contains(guess)){
                regular.remove(guess);
            }

            guess=scanner.nextLine();
        }
System.out.println(VIP.size()+regular.size());
        for (String e :VIP) {
            System.out.println(e);
        }

        for (String e :regular) {
            System.out.println(e);
        }
    }
}
