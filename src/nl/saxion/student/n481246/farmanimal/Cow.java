package nl.saxion.student.n481246.farmanimal;

public class Cow extends FarmAnimal {
    private int litresADay;

    public Cow(String name, int chipNumber, int litresADay) {
        super(name, chipNumber);
        this.litresADay = litresADay;
    }

    public int getLitresADay() {
        return litresADay;
    }

    @Override
    public String toString() {
        return name + " gives " + litresADay + " litres milk per day";
    }

    @Override
    public void makeSound() {
        System.out.println("Moooooh");
    }
}
