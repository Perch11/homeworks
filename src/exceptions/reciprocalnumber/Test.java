package exceptions.reciprocalnumber;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        ReciprocalNumber number = new ReciprocalNumber();
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a real number: ");
        double num = sc.nextInt();

        try {
            double reciprocal = number.reciprocal(num);
            System.out.println(reciprocal);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
