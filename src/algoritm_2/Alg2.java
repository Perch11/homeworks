package algoritm_2;

import java.util.Scanner;

public class Alg2 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int n = ss.nextInt(), x = ss.nextInt(), result = 1;

        for (int i = 0; i < x; i++) {
            result = result * n;
        }

        System.out.println("result = " + result);


    }
}
