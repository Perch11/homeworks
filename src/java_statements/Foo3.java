package java_statements;

import java.util.Scanner;

public class Foo3 {

    void foo(){
        Scanner ss = new Scanner(System.in);
        System.out.print("input point: ");
        int y =ss.nextInt();

        if (y<8 && y>5){
            System.out.println(y+"<8 ev "+ y +">5");

        } else if (y<20 && y>15) {
            System.out.println(y+"<20 ev "+ y +">15");
        }else{
            System.out.println("y= "+y);
        }

    }

    public static void main(String[] args) {
        Foo3 f = new Foo3();
        f.foo();
    }
}
