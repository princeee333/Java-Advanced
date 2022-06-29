package DefiningClasses.exercise.RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        while (n-- > 0) {
            String[] token = scanner.nextLine().split(" ");
            String model = token[0];
            int engineSpeed = Integer.parseInt(token[1]);
            int enginePower = Integer.parseInt(token[2]);

            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(token[3]);
            String cargoType = token[4];

            Cargo cargo = new Cargo(cargoWeight, cargoType);
            List<Type> types = new ArrayList<>();
            for (int i = 5; i < token.length; i = i +2) {
                double tirePressure = Double.parseDouble(token[i]);
                int tireAge = Integer.parseInt(token[i + 1]);
                Type type = new Type(tirePressure, tireAge);
                types.add(type);
            }
            Car car = new Car(model, engine, cargo, types);
            cars.add(car);
        }
        String cargoType = scanner.nextLine();

        if (cargoType.equals("fragile")){
            cars.stream().filter(car->car.getCargo().getType().equals("fragile"))
                    .filter(car->car.getTypes().stream().anyMatch(type -> type.getPressure()<1))
                    .forEach(car->System.out.println(car.getModel()));


        }else if (cargoType.equals("flamable")){
            cars.stream().filter(car->car.getCargo().getType().equals("flamable"))
                    .filter(car->car.getEngine().getPower()>250)
                    .forEach(car->System.out.println(car.getModel()));

        }

    }
}
