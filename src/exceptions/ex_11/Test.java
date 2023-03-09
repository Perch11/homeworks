package exceptions.ex_11;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MethodsString methodsString = new MethodsString();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        try {
            String uppercase = methodsString.toUppercase(input);
            System.out.println("Uppercase: " + uppercase);

            String reverse = methodsString.reverseString(input);
            System.out.println("Reverse: " + reverse);

            int vowelCount = methodsString.countVowels(input);
            System.out.println("Vowel count: " + vowelCount);
        } catch (NullPointerException e) {
            System.out.println("Error: Input string is null");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Input string is empty");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
