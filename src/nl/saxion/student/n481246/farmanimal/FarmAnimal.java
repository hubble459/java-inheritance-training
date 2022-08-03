package nl.saxion.student.n481246.farmanimal;

public abstract class FarmAnimal {
    protected String name;
    protected int chipNumber;

    public FarmAnimal(String name, int chipNumber) {
        this.name = name;
        this.chipNumber = chipNumber;
    }

    public abstract void makeSound();
}
