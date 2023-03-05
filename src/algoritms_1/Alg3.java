package algoritms_1;

import java.util.Random;

public class Alg3 {
    void evenOrOdd() {

        int n = (int) (Math.random() * 100);
        System.out.print(n + "-");
        if (n % 2 == 0) {
            System.out.println("number is even");

        } else {
            System.out.println("number is odd");
        }
    }

    public static void main(String[] args) {
        Alg3 a = new Alg3();

        for (int i = 1; i <= 100; i++) {

            a.evenOrOdd();
        }
    }
}
