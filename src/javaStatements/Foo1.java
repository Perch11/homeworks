package javaStatements;

import java.util.Scanner;

public class Foo1 {

     void foo(int x){
        if ( x > 0 ){
            if( x % 2 == 0){
                System.out.println(x + " tiv@ zuyg e");
            } else {
                System.out.println(x + " tiv@ kent e");
            }
        } else {
            System.out.println("sxal nermucum e texi unecel");
        }

    }

        public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        Foo1 f = new Foo1();
        System.out.print("nermucel drakan amboxj tiv: ");
        int y =ss.nextInt();
        f.foo(y);
    }

}
