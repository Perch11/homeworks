package enumeration.shape2;

public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}
 class Circle extends Shape {
     private final double radius;
     Circle() {
         this.radius = 5;
     }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

 class Square extends Shape {
    private final double sideLength;
     Square() {
         this.sideLength = 0;
     }

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideLength;
    }
}

 class Rectangle extends Shape {
    private final double length;
    private final double width;
     Rectangle() {
         this.length = 0;
         this.width = 0;
     }

    public Rectangle(double length,double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}