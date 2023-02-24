package homework_abstractclasses_interface.animals;

abstract class Animals {
    public abstract void cats();
    public abstract void dogs();
}

// Implement the abstract methods in the Cats class
class Cats extends Animals {
    public void cats() {
        System.out.println("Cats meow");
    }
    public void dogs() {
        // Do nothing
    }
}

// Implement the abstract methods in the Dogs class
class Dogs extends Animals {
    public void cats() {
        // Do nothing
    }
    public void dogs() {
        System.out.println("Dogs bark");
    }
}
public class Main {
    public static void main(String[] args) {
        Cats c = new Cats();
        Dogs d = new Dogs();
        c.cats();
        d.dogs();
    }
}
