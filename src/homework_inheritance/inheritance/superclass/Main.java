package homework_inheritance.inheritance.superclass;


class SuperClass {
    public String message = "Hello SuperClass class";
}

class SubClass extends SuperClass {
    public String message = "Hello SubClass class";
}
public class Main {
    public static void main(String[] args) {

        SubClass obj = new SubClass();
        System.out.println(obj.message);
        System.out.println(((SuperClass)obj).message);

    }
}
