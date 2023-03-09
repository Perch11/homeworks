package exceptions.secondnumberzero;

import java.util.Scanner;

public class ValidInputs {
    /**
     * this method takes integer number
     * @param scanner type Scanner
     * @param prompt type string
     * @return type int
     * @throws IllegalArgumentException when input is not integer
     */
    public int getIntegerInput(Scanner scanner, String prompt) throws IllegalArgumentException {
        System.out.print(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            throw new IllegalArgumentException("Error: The input must be an integer.");
        }
    }

    /**
     * this method takes integer number
     * @param scanner type Scanner
     * @param prompt type string
     * @return type int
     * @throws IllegalArgumentException when input == 0
     */
    public int getNonZeroIntegerInput(Scanner scanner, String prompt) throws IllegalArgumentException {
        int input = getIntegerInput(scanner, prompt);
        if (input == 0) {
            throw new IllegalArgumentException("Error: The input cannot be zero.");
        }
        return input;
    }

    /**
     * this method divides two number
     * @param numerator int type
     * @param denominator int type
     * @return type double
     * @throws ArithmeticException when denominator == 0
     */
   public double divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Error: Division by zero is undefined.");
        }
        return (double) numerator / denominator;
    }

}
