import java.util.Scanner;

public class ExceptionHandling {

    // Custom exception for insufficient balance
    static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Array index access with exception handling
        System.out.println("Array Index Access");
        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.print("Enter index to access (0-4): ");
        try {
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds!");
        }
        System.out.println("--------------------------------");

        // 2. Try-catch-finally block
        System.out.println("\nTry-Catch-Finally");
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        } finally {
            System.out.println("Finally block executed.");
        }
        System.out.println("--------------------------------");

        // 3. Bank withdrawal with exception
        System.out.println("\nBank Withdrawal");
        double balance = 1000.00;
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        try {
            withdraw(balance, amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }
        System.out.println("--------------------------------");

        // 4. Nested try-catch blocks
        System.out.println("\nNested Try-Catch Demo");
        try {
            try {
                int[] nums = new int[3];
                nums[5] = 100;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index out of bounds.");
            }

            String str = null;
            System.out.println(str.length());

        } catch (NullPointerException e) {
            System.out.println("Outer catch: Null pointer exception.");
        }

        scanner.close();
    }

    // Bank withdrawal method
    public static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! Available: " + balance);
        } else {
            System.out.println("Withdrawal successful. Remaining balance: " + (balance - amount));
        }
    }
}
