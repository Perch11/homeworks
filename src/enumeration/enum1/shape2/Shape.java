package enumeration.enum1.shape2;

public abstract class Shape {
    /**
     * this method will calculate the area of a specific image after being overridden
     * @return
     */
    public abstract double getArea();

    /**
     * this method will calculate the perimeter of a specific image after being overridden
     * @return
     */
    public abstract double getPerimeter();
}
class Circle extends Shape {
    private double radius;

    /**
     * we can set radius
     * @param radius type double
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * we can get radius
     * @return type double radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * this method calculates the area of the circle
     * @return type double area
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * this method calculates the perimeter of the circle
     * @return
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square extends Shape {
    private double sideLength;

    /**
     * we can set sideLength
     * @param sideLength double type
     */
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    /**
     * we can get sideLength
     * @return type double
     */
    public double getSideLength() {
        return sideLength;
    }

    /**
     * this method calculates the area of the square
     * @return double type area
     */
    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    /**
     * this method calculates the perimeter of the square
     * @return type double perimeter
     */
    @Override
    public double getPerimeter() {
        return 4 * sideLength;
    }
}

class Rectangle extends Shape {
    private  double length;
    private  double width;

    /**
     * we can set rectangle length and width
     * @param length double type
     * @param width double type
     */
    public void setRectangle(double length,double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * we can get rectangle length
     * @return type double
     */
    public double getLength() {
        return length;
    }

    /**
     * we can get rectangle width
     * @return type double
     */
    public double getWidth() {
        return width;
    }

    /**
     * this method calculates the area of the rectangle
     * @return double type area
     */
    @Override
    public double getArea() {
        return length * width;
    }

    /**
     * this method calculates the perimeter of the rectangle
     * @return double type perimeter
     */
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}