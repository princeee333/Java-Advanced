package exams.Thirth;

public class Example {

    //   public void addEgg(Egg egg) {
    //       if(this.data.size()<capacity) {
    //           data.add(egg);
    //       }
    //   }
//First, write a class Egg with the following properties:
//•	color: String
//•	strength: int
//•	shape: String
//The class constructor should receive color, strength and shape. You need to create the appropriate getters and setters. Override the toString() method in the following format:
//"{color} egg, with {strength} strength and {shape} shape."
//Next, write a class Basket that has data (a List which stores the entity Egg). All entities inside the repository have the same properties. Also, the Basket class should have those properties:
//•	material: String
//•	capacity: int
//The class constructor should receive material and capacity, also it should initialize the data with a new instance of the collection. Implement the following features:
//•	List<Egg> data - collection that holds added eggs
//•	Method addEgg(Egg egg) – adds an entity to the data if there is room for it
//•	Method removeEgg(string color) – removes an egg by given color, if such exists, and returns boolean (true if it is removed, otherwise – false)
//•	Method getStrongestEgg()– returns the strongest egg
//•	Method getEgg(string color) – returns the egg with the given color
//•	Method getCount – returns the number of eggs
//•	Method report() – returns a string in the following format (print the eggs in order of appearance):

//    public boolean removeEgg(String color) {
//        return this.data.removeIf(s -> s.getColor().equals(color));
//    }
//    public Egg getStrongestEgg(){
//        return this.data.stream().max(Comparator.comparing(Egg::getStrength)).orElse(null);
//    }
//    public Egg getEgg(String color){
//        return  this.data.stream().filter(s -> s.getColor().equals(color)).findFirst().orElse(null);
//    }
//    public int getCount(){
//        return this.data.size();
//    }
//    public String report(){
//        return this.material + " basket contains:" + System.lineSeparator() +
//                this.data.stream().map(Egg::toString).collect(Collectors.joining(System.lineSeparator()));
//    }
//}
//import java.util.ArrayList;
//        import java.util.List;
//        import java.util.stream.Collectors;
//
//public class Cage {
//    private String name;
//    private int capacity;
//    private List<Parrot> data = new ArrayList<>();
//
//    public Cage(String name, int capacity) {
//        this.name = name;
//        this.capacity = capacity;
//    }
//
//    public void add(Parrot parrot) {
//        if(this.data.size() < this.capacity) {
//            this. data.add(parrot);
//        }
//    }
//    public boolean remove(String name) {
//        return this.data.removeIf(s -> s.getName().equals(name));
//    }
//
//    public Parrot sellParrot(String name) {
//        Parrot parrot = this.data.stream().filter(s -> s.getName().equals(name)).findAny().orElse(null);
//        if (parrot != null) {
//            parrot.setAvailable(false);
//        }
//        return parrot;
//    }
//    public List<Parrot> sellParrotBySpecies(String species) {
//        List<Parrot> parrots = new ArrayList<>();
//        this.data.stream().filter(s -> s.getSpecies().equals(species)).forEach(s-> {
//            parrots.add(s);
//            s.setAvailable(false);
//        });
//        return parrots;
//    }
//
//    public int count(){
//        return this.data.size();
//    }
//    public String report(){
//        return "Parrots available at " + this.name + ":" + System.lineSeparator() +
//                this.data.stream().filter(Parrot::isAvailable).map(Parrot::toString).collect(Collectors.joining(System.lineSeparator()));
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public int getCapacity() {
//        return capacity;
//    }
    //public boolean remove(String name) {
    //        if (this.fishInPool.containsKey(name)) {
    //            this.fishInPool.remove(name);
    //            return true;
    //        }
    //        return false;
    //    }
    //
    //    public Fish findFish(String name){
    //        return this.fishInPool.get(name);
    //    }
    //    public String report() {
    //        return "Aquarium: " + this.name + " ^ Size: " + this.size + System.lineSeparator() +
    //                this.fishInPool.values().stream().map(Fish::toString).collect(Collectors.joining(System.lineSeparator()));
    //    }
    //
    //    public String getName() {
    //        return name;
    //    }
    //
    //    public int getCapacity() {
    //        return capacity;
    //    }
    //
    //    public int getSize() {
    //        return size;
    //    }
    //
    //    public int getFishInPool() {
    //        return fishInPool.size();
    //    }
    //}
}