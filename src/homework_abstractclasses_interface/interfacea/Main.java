package homework_abstractclasses_interface.interfacea;
interface A {
    public void methOne();
    public void methSecond();

}
class MyClass implements A{
    public void methOne() {
        System.out.println("Implementation of methOne");
    }
    public void methSecond() {
        System.out.println("Implementation of methSecond");
    }
}
public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methOne();
        obj.methSecond();
    }
}
