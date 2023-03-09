package exceptions.invalidemail;

import java.util.Scanner;

public class ValidEmail {
    /**
     * this method inputs email address
     * @param scanner type Scanner
     * @return type string email
     */
    public String getEmailInput(Scanner scanner) {
        System.out.print("Enter an email address: ");
        return scanner.nextLine();
    }

    /**
     * this method shows email matches or not
     * @param email
     * @throws Exception when email not matches
     */
    public void validateEmail(String email) throws Exception {
        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new Exception("Invalid email address");
        }
    }
}
