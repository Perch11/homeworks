package javaStatements;

import java.util.Scanner;

public class Foo18 {

    void foo(int x){

        if(x>=10000 && x<=99999){
            int sum = 0;
            while(x != 0){
                sum+=x % 10;
                x = x / 10;
                //System.out.println(sum);
            }
            System.out.println(sum);
        }else{
            System.out.println("nermucel 5 nish unecox tiv");
        }

    }



    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = ss.nextInt();

        Foo18 f =new Foo18();
        f.foo(n);
    }
}
