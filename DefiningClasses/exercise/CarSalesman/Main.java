package DefiningClasses.exercise.CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfEngine = Integer.parseInt(scanner.nextLine());
        Map<String, Engine> engineInCatalog = new HashMap<>();
        List<Car> carsInCatalog = new ArrayList<>();


        for (int i = 0; i < numberOfEngine; i++) {
            String [] tokens = scanner.nextLine().split(" ");
            Engine engine=null;
            if (tokens.length==4){
                engine=new Engine(tokens[0],Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]),tokens[3]);
            }else if (tokens.length==3){
                if (Character.isLetter(tokens[2].charAt(0))){
                    engine=new Engine(tokens[0],Integer.parseInt(tokens[1]),tokens[2]);
                }else if (Character.isDigit(tokens[2].charAt(0))){
                    engine=new Engine(tokens[0],Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]));
                }

            }else if (tokens.length==2){
                engine=new Engine(tokens[0],Integer.parseInt(tokens[1]));
            }
                  engineInCatalog.put(tokens[0],engine);
        }

        int m = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < m; i++) {
            String [] tokens = scanner.nextLine().split(" ");
            String model = tokens[0];
            String engine = tokens[1];
            Car car = null;
            Engine current = engineInCatalog.get(engine);

            if (tokens.length==4){
                car =new Car(tokens[0],current,Integer.parseInt(tokens[2]),tokens[3]);
            }else if (tokens.length==3){
                if (Character.isLetter(tokens[2].charAt(0))){
                    car =new Car(model,current,tokens[2]);
                }else if (Character.isDigit(tokens[2].charAt(0))){
                    car =new Car(model,current,Integer.parseInt(tokens[2]));
                }

            }else if (tokens.length==2){
                car=new Car(tokens[0],current);
            }

            carsInCatalog.add(car);
        }
        carsInCatalog.forEach(System.out::println);
    }
}
