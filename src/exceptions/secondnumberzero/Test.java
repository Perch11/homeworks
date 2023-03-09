package exceptions.secondnumberzero;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidInputs validInputs = new ValidInputs();
        int numerator, denominator;
        try {
            numerator = validInputs.getIntegerInput(scanner, "Enter the numerator: ");
            denominator = validInputs.getNonZeroIntegerInput(scanner, "Enter the non-zero denominator: ");
            double quotient = validInputs.divide(numerator, denominator);
            System.out.println("The quotient is " + quotient);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
