package exceptions.invalidemail;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidEmail validEmail = new ValidEmail();

        try {
            String email = validEmail.getEmailInput(scanner);
            validEmail.validateEmail(email);
            System.out.println("The email address is valid");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
