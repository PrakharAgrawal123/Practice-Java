//COUNT WORDS WHEN THERE IS A SINGLE GAP BETWEEN THE WORDS (LIKE "HELLO WORLD")

import java.util.Scanner;
public class Count_Words{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a string");
    String s = sc.nextLine();
    s = s.trim();
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