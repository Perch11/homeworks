package java_statements;

public class Foo11 {

    void foo(){

        for (int i = 1; i<=200;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Foo11 f = new Foo11();
        f.foo();
    }
}
