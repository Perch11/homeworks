package java_statements;

import java.util.Scanner;

public class Foo17 {

    int foo(int n){

        return (1+n)/2;

    }




    public static void main(String[] args) {

        Scanner ss = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = ss.nextInt();

        Foo17 f =new Foo17();

        System.out.println(f.foo(n));

    }
}
