package algoritm_2;

import java.util.Scanner;

public class Alg3 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int rev = 0;
        System.out.print("enter number: ");
        int n = ss.nextInt();

        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("reverse number = " + rev);
    }
}
