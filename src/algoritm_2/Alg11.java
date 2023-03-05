package algoritm_2;

import java.util.Scanner;

public class Alg11 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int num = (int) (Math.random() * 100);
        System.out.println(num);
        int num1;
        do {
            System.out.println("gushakir tiv@");
            num1 = ss.nextInt();
            if (num1 > num) {
                System.out.println("too high,try again");
            }
            if (num1 < num) {
                System.out.println("too low,try again");
            }
        } while (num1 != num);

        System.out.println("bravo!! pahvac tiv@ " + num1 + " ner");


    }
}
