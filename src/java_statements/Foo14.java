package java_statements;

public class Foo14 {

    void foo(int x){

        if (x == 0){
            System.out.println("input equal to 0");
        }

        System.out.println(x*x);
    }

    public static void main(String[] args) {

        Foo14 f = new Foo14();
        f.foo(9);

    }
}
