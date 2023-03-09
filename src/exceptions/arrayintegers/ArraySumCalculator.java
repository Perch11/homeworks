package exceptions.arrayintegers;

import java.util.Scanner;

public class ArraySumCalculator {
    /**
     * this method inputs array numbers type int
     * @param scanner type Scanner
     * @return type int array
     * @throws IllegalArgumentException when input number is not integer
     */
    public int[] getIntegerArray(Scanner scanner) throws IllegalArgumentException {
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            if (scanner.hasNextInt()) {
                array[i] = scanner.nextInt();
            } else {
                throw new IllegalArgumentException("Error: Element " + (i+1) + " must be an integer.");
            }
        }
        return array;
    }

    /**
     * this method calculates sum of the array numbers
     * @param array type int array
     * @return type int sum of numbers
     */
    public int calculateArraySum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
