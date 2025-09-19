import java.util.Scanner;
public class Min_Max{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a [] = new int [5];
    for (int i = 0; i<5; i++)
    {
      System.out.println("Enter a number:");
      a[i] = sc.nextInt();
    }
    int max , min;
    max = min = a[0];
    for (int i = 1; i<5; i++)
    {
      if (a[i] > max)
      {
        max = a[i];
      }
      if (a[i] < min)
      {
        min = a[i];
      }
    }
    System.out.println("Largest Number:" +max );
    System.out.println("Smallest  Number:" +min );
  }
}