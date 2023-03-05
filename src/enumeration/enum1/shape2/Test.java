package enumeration.enum1.shape2;

public class Test {
    public static void main(String[] args) {

        Shape circle = ShapeType.CIRCLE.getShape();
        ((Circle)circle).setRadius(5);
        System.out.println(circle.getArea());


        Shape rec = ShapeType.RECTANGLE.getShape();
        ((Rectangle)rec).setRectangle(5,6);
        System.out.println(rec.getArea());

        Shape square = ShapeType.SQUARE.getShape();
        ((Square)square).setSideLength(8);
        System.out.println(square.getPerimeter());

    }
}
