import java.util.*;
public class PalindromeCheck{
  public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      System.out.println("Enter a String:");
      String n = sc.nextLine();
      
      String rev = "";
      for (int i = n.length() - 1; i >= 0; i--) {
        rev = rev + n.charAt(i);
      }

      if (rev.equals(n)) {
        System.out.println("String is Palindrome");
      }  
      else {
        System.out.println("String is not Palindrome");
      }
  }
}
