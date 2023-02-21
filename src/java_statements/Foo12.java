package java_statements;

import java.util.Scanner;

public class Foo12 {

    void foo(int x){
        if(x>=0  && x<10){
            System.out.println(x);
        } else if (x>=10 && x<100) {
            System.out.println(x / 10);
        } else if (x>=100 && x<1000) {
            System.out.println(x / 100);
        } else if (x>= 1000 && x<10000) {
            System.out.println(x / 1000);
        } else if (x>=10000 && x<100000) {
            System.out.println(x / 10000);
        }else{
            System.out.println("nermucel drakan 100000ic poqr tiv");
        }
    }




    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("input number: ");
                int y = ss.nextInt();
        Foo12 f = new Foo12();
        f.foo(y);
    }
}
