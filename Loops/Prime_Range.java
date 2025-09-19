
//THIS IS THE EXAMPLE OF NESTED LOOPS 

import java.util.Scanner;

public class Prime_Range{
  public static void main (String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int a = sc.nextInt();
    System.out.println("Enter second number");
    int b = sc.nextInt();
    if ( a > b)
    {
      int temp = a;
      a = b;
      b = temp;
    }
    for ( int n = a; n < b; n++)
    {
      int flag = 0;
      for ( int i = 2; i < n; i++)
      {
        if ( n % i == 0)
        {
          flag = 1;
          break;
        }
      }
      if ( flag == 0)
      {
        System.out.println(n);
      }
    }
  }
}
