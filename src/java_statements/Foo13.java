package java_statements;

import java.util.Scanner;

public class Foo13 {
            void foo(int x, int y){
                while (x < 5 && y < 10){
                    System.out.println(x+y);
                    ++x;
                    ++y;
                }

            }





    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int x = 1, y = 0;
        Foo13 f = new Foo13();
        f.foo(x,y);
    }
}
