package SetsAndMapsAdvanced.lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double []lineWithNumber= Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double,Integer> valueWithOccurrences =new LinkedHashMap<>();

        for (double value :lineWithNumber) {
            if (!valueWithOccurrences.containsKey(value)){
                valueWithOccurrences.put(value,1);
            }else {
                valueWithOccurrences.put(value,valueWithOccurrences.get(value)+1);

            }

        }
        for (Double key:valueWithOccurrences.keySet()) {
            System.out.println(String.format("%.1f -> %d",key,valueWithOccurrences.get(key)));
        }
    }
}
