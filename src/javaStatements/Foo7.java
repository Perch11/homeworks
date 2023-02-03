package javaStatements;

import java.util.Scanner;

public class Foo7 {

    void foo (double x,double y,double z){
        if(x>=y && x>=z){
            System.out.println("tveric mecaguyn@ = " + x);
        }else if (y>x && y>=z){
            System.out.println("tveric mecaguyn@ = " + y);
        }else {
            System.out.println("tveric mecaguyn@ = " + z);
        }
    }

    public static void main(String[] args) {

        Scanner ss = new Scanner(System.in);
        double x,y,z;
        System.out.print("input 3 parameters: ");
        x =ss.nextDouble();
        y =ss.nextDouble();
        z =ss.nextDouble();
        Foo7 f = new Foo7();
        f.foo(x,y,z);

    }
}
