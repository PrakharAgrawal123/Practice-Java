//COUNT WORDS WHEN THERE IS  NO SINGLE GAP BETWEEN THE WORDS (LIKE "HELLO   WORLD")

import java.util.Scanner;
public class Words_Count{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a string");
    String s = sc.nextLine();
    s = s.trim().replaceAll("\\s+", " ");
    int len = s.length();
    int space = 0;
    for (int i = 0; i<len; i++)
    {
      char c = s.charAt(i);
      if (c==' ')
      {
        space++;
      }
    }
    System.out.println("Number of words:" +(space+1));
  }
}