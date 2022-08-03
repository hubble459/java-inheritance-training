import nl.saxion.student.n481246.farmanimal.Cow;
import nl.saxion.student.n481246.farmanimal.FarmAnimal;
import nl.saxion.student.n481246.farmanimal.Horse;
import nl.saxion.student.n481246.farmanimal.Sheep;
import java.util.ArrayList;

public class Apple {
    public void run() {
        Cow cow = new Cow("Gerald", 1, 34);
        Sheep sheep = new Sheep("Barry",2, 53, "Pink");
        Horse horse = new Horse("Rainbow Dash", 3, true);
        System.out.println(cow);
        System.out.println(sheep);
        System.out.println(horse);

        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();
        farmAnimals.add(cow);
        farmAnimals.add(sheep);
        farmAnimals.add(horse);
        farmAnimals.add(new Cow("John", 4, 12));

        for (FarmAnimal fa: farmAnimals) {
            if (fa instanceof Cow) {
                Cow c = (Cow) fa;
                System.out.println(c.getLitresADay());
            }
            fa.makeSound();
        }
    }

    public static void main(String[] args) {
        new Apple().run();
    }
}
