package algoritm_2;

import java.util.Scanner;

public class Alg9 {

    public static void main(String[] args) {

        Scanner ss = new Scanner(System.in);
        System.out.print("Enter the positive number: ");
        double n = ss.nextInt();
        int num = 0;
        double sum = 1.0;
        while (num == 0) {
            if (n == 0) {
                System.out.println("0");
                break;
            }

            for (double i = 1; i <= n; i++) {
                sum = sum + (1 / i);
                System.out.println(1 / i);
            }
            System.out.println("sum = " + sum);
            break;
        }

    }
}
