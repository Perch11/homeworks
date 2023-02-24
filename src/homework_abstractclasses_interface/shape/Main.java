package homework_abstractclasses_interface.shape;

abstract class Shape {
    public abstract void draw();
    public abstract void erase();
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
    public void erase() {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("Drawing Triangle");
    }
    public void erase() {
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Drawing Square");
    }
    public void erase() {
        System.out.println("Erasing Square");
    }
}
public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Triangle();
        Shape shape3 = new Square();

        shape1.draw();
        shape1.erase();

        shape2.draw();
        shape2.erase();

        shape3.draw();
        shape3.erase();
    }
}
