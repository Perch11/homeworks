package java_statements;

import java.util.Scanner;

public class Foo4 {

    void foo (){
        Scanner ss = new Scanner(System.in);
        System.out.print("input point: ");
        int y =ss.nextInt();
        if (y > 0 && y % 5 == 0 ){
            if(y % 7 == 0){
                System.out.println("tiv@ bajanvum e ev 5-i ev 7-i");

            }else
            {System.out.println("tiv@ bajanvum e miayn 5-i");}
        } else if (y % 7 == 0) {
            System.out.println("tiv@ bajanvum e miayn 7-i");
        } else {
            System.out.println("tiv@ poqr e 0-ic kam aranc mnacordi chi bajanvum 5-i ev 7-i");
        }

    }

    public static void main(String[] args) {
    Foo4 f = new Foo4();
    f.foo();
    }
}
