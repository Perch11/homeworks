package homework_abstractclasses_interface.parent;
abstract class Parent {
    public abstract void message();
}

class ChildOne extends Parent {
    @Override
    public void message() {
        System.out.println("This is first subclass");
    }
}

class ChildSecond extends Parent {
    @Override
    public void message() {
        System.out.println("This is second subclass");
    }
}
public class Main {
    public static void main(String[] args) {
        ChildOne childOne = new ChildOne();
        ChildSecond childSecond = new ChildSecond();

        childOne.message();
        childSecond.message();
    }
}
