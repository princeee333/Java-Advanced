package SetsAndMapsAdvanced.lab;

import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudent = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> gradesMap = new TreeMap<>();

        for (int i = 0; i < numberOfStudent; i++) {
            String[] students = scanner.nextLine().split(" ");
            String name = students[0];
            double grade = Double.parseDouble(students[1]);
            if (!gradesMap.containsKey(name)) {

                gradesMap.put(name, new ArrayList<>());
                List<Double> gradesForStudent = gradesMap.get(name);
                gradesForStudent.add(grade);

            } else {
                gradesMap.get(name);
                List<Double> gradesForStudent = gradesMap.get(name);
                gradesForStudent.add(grade);

            }



        }

        gradesMap
                .forEach((key, value) -> {
                    double sum = 0;
                    for (Double aDouble : value) {
                        sum += aDouble;
                    }
                    double avgGrade = sum / value.size();

                    System.out.println(key +
                            " -> " +
                            value.stream().map(x -> String.format("%.2f", x)).collect(Collectors.joining(" ")) +
                            " (avg: " +
                            String.format("%.2f", avgGrade) +
                            ")");
                });
    }
}