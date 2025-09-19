
/*
import java.util.Scanner;
public class Count_Consonants{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a string");
    String s = sc.nextLine();
    int len = s.length();
    int count = 0;
    s = s.toLowerCase();
    for (int i = 0; i<len; i++)
    {
      char c = s.charAt(i);
      if ( c >= 'a' && c <= 'z')
      {
        if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
      {
        count ++;
      }

      }
    }
    System.out.println("Total number of consonants are ="  +count);
  }
}
*/



//COUNT VOWEL AND CONSONANTS BOTH IN A GIVEN STRING 

import java.util.Scanner;
public class Count_Consonants{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a string");
    String s = sc.nextLine();
    int len = s.length();
    int vowel_count = 0  , consonants_count = 0;
    s = s.toLowerCase();
    for (int i = 0; i<len; i++)
    {
      char c = s.charAt(i);
      if ( c >= 'a' && c <= 'z')
      {
        if (c == 'a'|| c == 'e'|| c =='i'|| c =='o'|| c =='u')
        {
          vowel_count ++;
        }
        else
        {
          consonants_count ++;
        }
      }
    }
    System.out.println("Total number of vowels =" +vowel_count);
    System.out.println("Total numbert of consonants =" +consonants_count);
  }
}
