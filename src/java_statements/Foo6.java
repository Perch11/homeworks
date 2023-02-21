package java_statements;

import java.util.Scanner;

public class Foo6 {
    void foo(double x,double y){

        if(x>= -5 && x<= 5 && y<=10 && y>= 0){
            System.out.println("(" + x + "," + y + ") ket@ 5 sharavixov shrjani mej e");
        }
        else {
            System.out.println("ket@ shrjanic durs e");}
    }


    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.print("nerucel x: ");
        double x = ss.nextDouble();
        System.out.print("nermucel y: ");
        double y = ss.nextDouble();
        Foo6 f = new Foo6();
        f.foo(x,y);
    }
}
