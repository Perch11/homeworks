package algoritms_1;

import java.util.Scanner;

public class Alg2 {
    void largestPrime(int n){
        int m = 2,  prime , number = 0 ;

        if(n <= 3)
        {
            System.out.println( n + " is prime number");
        }
        else
        {

            while(number == 0)
            {
                if (n % m != 0)
                {
                   m = m + 1;
                }
                else
                {
                    prime = n;
                    n = n / m;
                    if (n == 1)
                    {
                        System.out.println(prime + " is largest prime factor of this number");
                        number = 1;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {

        Scanner ss = new Scanner(System.in);
        Alg2 a = new Alg2();
        System.out.print("enter the number: ");
        int n = ss.nextInt();
        if(n>0) {
            a.largestPrime(n);
        }
        else {
            System.out.println("please enter positive number");
        }
    }
}
