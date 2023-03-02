package enumeration.shape2;

public class Test {
    public static void main(String[] args) {
        Circle circle = (Circle) ShapeType.CIRCLE.getShape();
        circle = new Circle();
        double area = circle.getArea(); // returns 78.53981633974483
        double perimeter = circle.getPerimeter(); // returns 31.41592653589793
    }
}
