package homework_abstractclasses_interface.interfacetest;

interface Test {
    public int square(int num);
}

class Arithmetic implements Test {
    public int square(int num) {
        return num * num;
    }
}
public class ToTestInt {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        int result = obj.square(8);
        System.out.println("The square of 8 is: " + result);
    }
}
