package DefiningClasses.lab.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            Car car = new Car();
            String brand = tokens[0];
            String model = tokens[1];
            int horsePower = Integer.parseInt(tokens[2]);

            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(horsePower);




            cars.add(car);
        }
        cars.forEach(e -> System.out.printf("The car is: %s %s - %d HP.%n", e.getBrand(), e.getModel(), e.getHorsePower()));
    }
}
