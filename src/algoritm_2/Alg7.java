package algoritm_2;

import java.util.Scanner;

public class Alg7 {
    public static void main(String[] args) {

        Scanner ss = new Scanner(System.in);

        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        System.out.println("enter 10 numbers");

        for (int i = 0; i < 10; i++) {

            int n = ss.nextInt();

            if (n > large) {
                large = n;
            }
            if (n < small) {
                small = n;
            }

        }
        System.out.println("large number = " + large);
        System.out.println("small number = " + small);
    }
}
