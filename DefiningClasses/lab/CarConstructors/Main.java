package DefiningClasses.lab.CarConstructors;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<CarConstructors> cars = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {


            String[] tokens = scanner.nextLine().split(" ");
            CarConstructors carConstructors;
            if (tokens.length == 1) {
                carConstructors = new CarConstructors(tokens[0]);
            } else {
                carConstructors = new CarConstructors(tokens[0],
                        tokens[1],
                        Integer.parseInt(tokens[2]));
            }
            cars.add(carConstructors);

        }
        cars.forEach(car-> System.out.println(car.carInfo()));
    }
}
