package enumeration.enum1.shape;

public enum Shape {

    SQUARE {
        /**
         * this method calculates the area of the square
         * @param sideLength1 double type
         * @param sideLength2 double type
         * @return type double area
         */
        @Override
        public double calculateArea(double sideLength1, double sideLength2) {
            return sideLength1 * sideLength2;
        }
    },

    RECTANGLE {
        /**
         * this method calculates the area of the rectangle
         * @param length double type
         * @param width double type
         * @return type double area
         */
        @Override
        public double calculateArea(double length, double width) {
            return length * width;
        }
    },

    CIRCLE {
        /**
         * this method calculates the area of the circle
         * @param radius1 double type
         * @param radius2 double type
         * @return type double area
         */
        @Override
        public double calculateArea(double radius1, double radius2) {
            return Math.PI * radius1 * radius2;
        }
    },

    TRIANGLE {
        /**
         * this method calculates the area of the triangle
         * @param base double type
         * @param height double type
         * @return double type area
         */
        @Override
        public double calculateArea(double base, double height) {
            return 0.5 * base * height;
        }
    };

    /**
     * this method will calculate the area of a specific image after being overridden
     * @param dimension1 double type
     * @param dimension2 double type
     * @return
     */
    public abstract double calculateArea(double dimension1, double dimension2);

}
