package exceptions.invalidnumber;

import java.util.Scanner;

public class SquareRoot {
    /**
     * this method takes an integer and calculates the root of that number
     * @param scanner type Scanner
     * @return type double
     * @throws IllegalArgumentException when input parameter <0
     */
   public double getPositiveIntegerInput(Scanner scanner) throws IllegalArgumentException {
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        if (number < 0) {
            throw new IllegalArgumentException("Invalid number");
        }
        return Math.sqrt(number);
    }
}
