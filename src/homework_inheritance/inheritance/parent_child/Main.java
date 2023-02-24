package homework_inheritance.inheritance.parent_child;

class Parent {
    public void showMessage() {
        System.out.println("Hello Parent class");
    }
}

class Child extends Parent {
    @Override
    public void showMessage() {
        System.out.println("Hello Child class");
        super.showMessage();
    }
}
public class Main {
    public static void main(String[] args) {

        Child child = new Child();

        child.showMessage();





    }
}
