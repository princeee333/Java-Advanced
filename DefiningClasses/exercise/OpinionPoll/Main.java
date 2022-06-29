package DefiningClasses.exercise.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<OpinionPoll> people = new ArrayList<>();

        while (n-- > 0) {
            String[] personInfo = scanner.nextLine().split(" ");
            String name = personInfo[0];
            int age = Integer.parseInt(personInfo[1]);

            OpinionPoll opinionPoll = new OpinionPoll(name, age);
            people.add(opinionPoll);


        }
        people.stream()
                .filter(person -> person.getAge() > 30)
                .sorted(Comparator.comparing(OpinionPoll::getName))
                .forEach(System.out::println);

    }
}
