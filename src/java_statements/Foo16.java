package java_statements;

import java.util.Scanner;

public class Foo16 {

    long foo(int n){
        if(n>=10 && n<41){
            long art = 1;
            for(int i = 10;i <= n; i+= 2){

                art*=i;
            }
            return art;

        } else{
            System.out.println("nermucel 0ic mec 41ic poqr erknish tiv");
        }
            return n;

    }




    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        Foo16 f = new Foo16();
        int n = ss.nextInt();
        System.out.println(f.foo(n));

    }
}
