package exceptions.invalidnumber;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SquareRoot sRoot = new SquareRoot();

        try {
            double squareRoot = sRoot.getPositiveIntegerInput(scanner);
            System.out.println("The square root is equals " + squareRoot);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Good bye");
        }
    }
}
