package java_statements;

import java.util.Scanner;

public class Foo15 {

    void foo(int n){
        int sum = 0;
        for (int i = 5; i <= n; i+=5 ){

            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {


        Scanner ss = new Scanner(System.in);

        int n = ss.nextInt();

        Foo15 f = new Foo15();

        f.foo(n);

    }
}
