package DefiningClasses.exercise.RawData;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Type> types;

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public List<Type> getTypes() {
        return types;
    }

    public Car(String model, Engine engine, Cargo cargo, List<Type> types) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.types = new ArrayList<>();
        this.types.addAll(types);



    }
}
