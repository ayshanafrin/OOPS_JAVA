package cycle3;
import java.util.Scanner;

public class PhoneNumberValidator {

    // Custom exception for invalid phone number
    static class InvalidPhoneNumberException extends Exception {
        public InvalidPhoneNumberException(String message) {
            super(message);
        }
    }

    // Method to validate phone number
    public static void validatePhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        if (!phoneNumber.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Phone number must contain exactly 10 digits.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        try {
            validatePhoneNumber(phoneNumber);
            System.out.println("Phone number is valid!");
        } catch (InvalidPhoneNumberException e) {
            System.out.println("Invalid Phone Number: " + e.getMessage());
        }

        scanner.close();
    }
}

