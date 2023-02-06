package algoritm_2;

import java.util.Scanner;

public class Alg4 {
    public static void main(String[] args) {

        Scanner ss = new Scanner(System.in);
        System.out.print("Enter the positive number: ");
        int n = ss.nextInt();
        if (n <= 0) {
            System.out.println("please enter positive number");
        }
        else
        {
            int m = 2, number = 0;

            if (n <= 3)
            {
                System.out.println(n + " is prime number");
            }
            else
            {

                                while (number == 0)
                                {
                                    if (n % m == 0)
                                    {
                                            if(n == m){
                                                System.out.println(n + " is prime number");
                                                number = 1;
                                            }
                                            else {
                                                    System.out.println(n + "is not a prime number");
                                                    number = 1;
                                            }
                                    }
                                    else {
                                        m = m + 1;
                                    }
                                }
            }
        }
    }
}
