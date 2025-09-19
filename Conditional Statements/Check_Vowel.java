//WRITE A JAVA PROGRAM TO CHECK WHETHER A ENTERED CHARACTER IS VOWEL OR NOT .
import java.util.Scanner;
public class Check_Vowel {
  public static void main (String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character:");
    char ch = sc.next().charAt(0);
    ch = Character.toLowerCase(ch);
    if ( ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u')
    {
      System.out.println("The entered character is vowel "+ch);
    }
    else if ( ch >= 'a' && ch<='z')
    {
      System.out.println("The entered character is not a vowel "+ch);
    }
    else
    {
      System.out.println("The entered character is not a character");
    }
    sc.close();
  }
}


 