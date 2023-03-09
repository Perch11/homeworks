package exceptions.invalidage;

import java.util.Scanner;


public class AgeValid {
    /**
     * this method shows whether the age matches or not
     * @param scanner type Scanner
     * @return int
     * @throws InvalidAgeException when age not matches
     */
    public int validator(Scanner scanner) throws InvalidAgeException{
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Invalid age! Age must be between 0 and 120.");
        }
        return age;
    }
}