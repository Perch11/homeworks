package enumeration.shape;

public enum Shape {

    SQUARE {
        @Override
        public double calculateArea(double sideLength1,double sideLength2) {
            return sideLength1 * sideLength2;
        }
    },

    RECTANGLE {
        @Override
        public double calculateArea(double length, double width) {
            return length * width;
        }
    },

    CIRCLE {
        @Override
        public double calculateArea(double radius1,double radius2) {
            return Math.PI * radius1 * radius2;
        }
    },

    TRIANGLE {
        @Override
        public double calculateArea(double base, double height) {
            return 0.5 * base * height;
        }
    };


    public abstract double calculateArea(double dimension1, double dimension2);

}
