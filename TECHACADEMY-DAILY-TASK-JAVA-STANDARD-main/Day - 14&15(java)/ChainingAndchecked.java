public class ChainingAndchecked {
    public static void main(String[] args) {
        // Part 1: Exception Chaining
        try {
            methodThatChainsException();
        } catch (Exception e) {
            System.out.println("Caught chained exception: " + e);
            System.out.println("Original cause: " + e.getCause());
        }

        // Part 2: Handling a checked exception
        try {
            methodThatCallsCheckedException();
        } catch (Exception e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }
    }

    // Part 1: Exception Chaining
    public static void methodThatChainsException() throws Exception {
        try {
            throw new IllegalArgumentException("Original illegal argument");
        } catch (IllegalArgumentException e) {
            throw new Exception("Wrapped exception", e);
        }
    }

    // Part 2: Checked Exception Handling
    public static void methodThatCallsCheckedException() throws Exception {
        try {
            methodThatThrowsCheckedException();
        } catch (CustomCheckedException e) {
            throw new Exception("Error in methodThatCallsCheckedException", e);
        }
    }

    public static void methodThatThrowsCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException("This is a custom checked exception");
    }
}

// Custom checked exception class
class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}
