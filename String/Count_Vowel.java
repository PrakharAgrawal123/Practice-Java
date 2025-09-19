import java.util.Scanner;
public class Count_Vowel{
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
      if (c == 'a'|| c == 'e'|| c =='i'|| c =='o'|| c =='u')
      {
        count ++;
      }
    }
    System.out.println(count);
  }
}