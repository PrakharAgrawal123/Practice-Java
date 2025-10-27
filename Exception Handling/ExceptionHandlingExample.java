
public class ExceptionHandlingExample {

    public static void main(String[] args) {
        try {
            // Code that may cause an exception
            int[] numbers = {10, 20, 30};
            int result = numbers[3] / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handles division by zero
            System.out.println("Error: Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handles invalid array index
            System.out.println("Error: Array index out of range!");
        } catch (Exception e) {
            // Handles any other exceptions
            System.out.println("An unexpected error occurred: " + e);
        } finally {
            // Code that always executes (optional)
            System.out.println("Execution of try-catch block is complete.");
        }

        System.out.println("Program continues normally...");
    }
}
