package javaclass_object.rectangle;

public class Rectangle {

     private int length;
     private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea(){

        System.out.println(this.length * this.width);

            }




    public static void main(String[] args) {

           Rectangle rectangle = new Rectangle(5,14);
           rectangle.calculateArea();
           Rectangle rectangle2 = new Rectangle(7,45);
           rectangle2.calculateArea();

    }
}
