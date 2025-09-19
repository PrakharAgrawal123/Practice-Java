import java.util.Scanner;

public class Prime_Number{
  public static void main (String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int flag = 0;
    for (int i = 2; i<n; i++ )
    {
      if ( n % i == 0)
      {
        flag = 1;
        break;
      }
    }
    if ( flag == 0)
    {
      System.out.println( n+ " is prine");
    }
    else
    {
      System.out.println(n+ " is not prime");
    }
  }
}