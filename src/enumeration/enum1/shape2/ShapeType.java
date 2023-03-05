package enumeration.enum1.shape2;

public enum ShapeType {
    CIRCLE(new Circle()),
    SQUARE(new Square()),
    RECTANGLE(new Rectangle());

    private final Shape shape;

    /**
     * constructor ShapeType class
     * @param shape type Shape
     */
    ShapeType(Shape shape) {
        this.shape = shape;
    }

    /**
     * we can get shape
     * @return type Shape
     */
    public Shape getShape() {
        return shape;
    }
}
