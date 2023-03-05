package algoritm_2;

import java.util.Scanner;

public class Alg14 {
    /**
     * calculates the n power of a number
     * @param x - type int
     * @return type double
     */
    double pow(int x) {
        double pow = 1;
        for (int i = 0; i < x; i++) {
            pow *= x;
        }
        return pow;
    }

    /**
     * calculates the factorial of a number
     * @param x - int type
     * @return double type
     */
    double factorial(int x) {
        double factorial = 1;

        for (int i = 2; i < x; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {

        Alg14 a = new Alg14();
        Scanner ss = new Scanner(System.in);

        int n;

        do {
            System.out.print("enter number:");
            n = ss.nextInt();
        } while (n <= 0);
        double sum = 1;

        for (int x = 2, i = 1; x < n; i++, x += 2) {
            if (i % 2 == 0) {
                sum -= a.pow(x) / a.factorial(x);
            } else {
                sum += a.pow(x) / a.factorial(x);
            }
        }

        double sum1 = Math.pow(sum, n);
        System.out.println(Math.cos(sum1));

    }
}