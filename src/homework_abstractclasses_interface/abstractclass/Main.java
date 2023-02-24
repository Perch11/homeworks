package homework_abstractclasses_interface.abstractclass;

abstract class AbstractClass {
    public AbstractClass() {
        System.out.println("This is constructor of abstract class");
    }

    public abstract void a_method();

    public void normal_method() {
        System.out.println("This is a normal method of abstract class");
    }
}

class SubClass extends AbstractClass {
    public SubClass() {
        System.out.println("This is constructor of subclass ");
    }
    @Override
    public void a_method() {
        System.out.println("This is abstract method");
    }
}
public class Main {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.a_method();
        obj.normal_method();
    }
}
