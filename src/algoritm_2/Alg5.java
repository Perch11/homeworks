package algoritm_2;

import java.util.Scanner;

public class Alg5 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int num1, num2;
        String str; ;
        do{
            System.out.println("enter two numbers");
            num1 = ss.nextInt();

            num2 = ss.nextInt();

            System.out.println("sum = " + (num1 + num2));
            System.out.println("continue? yes or no");
            str = ss.next();
        }
        while (!str.equals("no"));

    }
}
