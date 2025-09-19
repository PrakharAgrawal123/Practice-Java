//Write a program to check whether an entered character is an uppercase letter.

public class Check_Upper_Case {
  public static void main(String[] args) {
    char ch = 'A';

    if (ch >= 'A' && ch <= 'Z') {
      System.out.println(ch + " is an uppercase letter.");
    } else {
      System.out.println(ch + " is not an uppercase letter.");
    }
  }

}
