package nl.saxion.student.n481246.farmanimal;

public class Sheep extends FarmAnimal {
    private int weight;
    private String colour;

    public Sheep(String name, int chipNumber, int weight, String colour) {
        super(name, chipNumber);
        this.weight = weight;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return name + " weighs " + weight + " kg and has colour " + colour;
    }

    @Override
    public void makeSound() {
        System.out.println("b e e e e e e e e");
    }
}
