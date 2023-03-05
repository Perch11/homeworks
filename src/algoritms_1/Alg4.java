package algoritms_1;

import java.util.Random;

public class Alg4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int i, large = 0, small = 100;
        for (i = 1; i <= 10; i++) {
            int n = rand.nextInt(100);

            System.out.print(n + " ");
            if (i == 10) {
                System.out.println("");
            }
            while (n > large) {
                large = n;
            }
            while (n < small) {
                small = n;
            }

        }
        System.out.println("largest number: " + large);
        System.out.println("smallest number: " + small);
    }
}
