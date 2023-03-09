package exceptions.arrayintegers;

import exceptions.invalidage.InvalidAgeException;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArraySumCalculator asc = new ArraySumCalculator();
        int[] array;
        try {
            array = asc.getIntegerArray(scanner);
            System.out.println( "The sum of the array is " + asc.calculateArraySum(array));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
