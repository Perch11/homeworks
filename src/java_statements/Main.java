package java_statements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ss = new Scanner(System.in);
        int y = ss.nextInt();
        Foo1 f1 = new Foo1();
        Foo2 f2 =new Foo2();
        f1.foo(y);
        f2.foo(y);

    }
}
