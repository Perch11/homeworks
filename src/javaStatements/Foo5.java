package javaStatements;

import java.util.Scanner;

public class Foo5 {




    boolean foo (int x) {

        if (x / 10 % 10 == 7) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        Foo5 f = new Foo5();
        System.out.print("nermucel eranish drakan tiv: ");

        int y = ss.nextInt();
        if (y >= 100 && y <= 999) {
            boolean result = f.foo(y);
            if (result) {
                System.out.println("tvi 2rd tvanshan@ 7 e: " + y);
            } else {
                System.out.println("ayl tvanshan e: " + y);
            }
        }else{
            System.out.println("hamapatasxan tiv nermucvac che");
        }
    }
}
