package enumeration.shape;

public class Test {
    public static void main(String[] args) {

        double squareArea = Shape.SQUARE.calculateArea(5.0,5.0);
        double rectangleArea = Shape.RECTANGLE.calculateArea(3.0, 4.0);
        double circleArea = Shape.CIRCLE.calculateArea(2.5,2.5);
        double triangleArea = Shape.TRIANGLE.calculateArea(4.0, 6.0);

        System.out.println("Square area: " + squareArea);
        System.out.println("Rectangle area: " + rectangleArea);
        System.out.println("Circle area: " + circleArea);
        System.out.println("Triangle area: " + triangleArea);
    }
}
