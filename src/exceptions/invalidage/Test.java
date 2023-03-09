package exceptions.invalidage;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        AgeValid agevalid = new AgeValid();
        int age;

        try {
            age = agevalid.validator(sc);
        } catch (InvalidAgeException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println("Your age is " + age);

    }
}

