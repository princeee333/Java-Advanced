package SetsAndMapsAdvanced.lab;

import java.util.*;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();

       LinkedHashSet<String> parkingInfo = new LinkedHashSet<>();
        while (!input.equals("END")){
            String command = input.split(", ")[0];
            String carNumber = input.split(", ")[1];

            if (command.equals("IN")){
                parkingInfo.add(carNumber);
            }else {
                parkingInfo.remove(carNumber);
            }



            input=scanner.nextLine();
        }
        if (parkingInfo.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String e :parkingInfo) {
                System.out.println(e);
            }
        }
    }
}
