
class InvalidAgeException extends Exception {
  InvalidAgeException(String msg) {
    super(msg);
  }
}

public class AgeValidator {
  public static void main(String[] args) {
    int age = 16;

    try {
      if (age < 18) {
        throw new InvalidAgeException("Age must be 18 or above!");
      }
      System.out.println("Valid age.");

    } catch (InvalidAgeException e) {
      System.out.println("Caught: " + e.getMessage());
    }
  }
}
