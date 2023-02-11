package algoritm_2;

import java.util.Scanner;

public class Alg13 {

    double pow (int x){
        int pow = 1;
        for (int i = 0; i < x ; i++) {
            pow *= x;

        }
        return pow;
    }

    double factorial(int x){
        int factorial = 1;
        for (int i = 2; i < x; i++) {
            factorial *= i;
        }
        return factorial;
    }


    public static void main(String[] args) {

        Alg13 a = new Alg13();
        Scanner ss = new Scanner(System.in);

        int n;

        do{
            System.out.print("enter number:");
            n = ss.nextInt();
        } while (n<=0);

        double sum = n;

        for (int x = 3,i = 1; x < n; i++, x+=2) {
                if(i % 2 == 0){
                    sum -= (double) a.pow(x)/a.factorial(x);
                }else {
                    sum += (double) a.pow(x)/a.factorial(x);
                }
        }

         double sum1 = Math.pow(sum,n);
         System.out.println(Math.sin(sum1));

    }
}
