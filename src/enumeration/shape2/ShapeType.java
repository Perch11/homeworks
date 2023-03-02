package enumeration.shape2;

public enum ShapeType {
    CIRCLE(new Circle()),
    SQUARE(new Square()),
    RECTANGLE(new Rectangle());

    private final Shape shape;

    ShapeType(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }
}
