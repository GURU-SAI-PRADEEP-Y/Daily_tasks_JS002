import java.util.Scanner;

public class CustException {

    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    // Method to check age
    public static void ageChecking(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid Age: Age should be Above 18");
        } else {
            System.out.println("Valid age: You have matched the Age criteria");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        try {
            int age = scanner.nextInt();
            ageChecking(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("You have successfully handled the custom exception!");
        }
    }
}
