package nl.saxion.student.n481246.farmanimal;

public class Horse extends FarmAnimal {
    private boolean canJump;

    public Horse(String name, int chipNumber, boolean canJump) {
        super(name, chipNumber);
        this.canJump = canJump;
    }

    @Override
    public String toString() {
        if (canJump) return name + " can jump";
        return name + " can't jump";
    }

    @Override
    public void makeSound() {
        System.out.println("Neigh");
    }
}
