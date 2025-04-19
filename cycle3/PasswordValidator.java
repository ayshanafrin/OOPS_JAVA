import java.util.Scanner;

public class PasswordValidator {

    // Custom exception class
    static class InvalidPasswordException extends Exception {
        public InvalidPasswordException(String message) {
            super(message);
        }
    }

    // Method to validate the password
    public static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password must be at least 8 characters long.");
        }

        if (!password.matches(".*\\d.*")) {
            throw new InvalidPasswordException("Password must contain at least one digit.");
        }

        if (!password.matches(".*[\\{\\$#&@SHell@123].*")) {
            throw new InvalidPasswordException("Password must contain at least one special character: {, $, #, &");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        try {
            validatePassword(password);
            System.out.println("Password is valid!");
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid Password: " + e.getMessage());
        }

        scanner.close();
    }
}
