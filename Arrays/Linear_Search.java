import java.util.Scanner;
public class Linear_Search{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    int a[] = new int[5];
    int flag = 0;
    for (int i = 0; i<5; i++)
    {
      System.out.println("Enter the numbers:");
      a [i] = sc.nextInt();
    }
    int i;
    System.out.println("Number to be searched:");
    int n = sc.nextInt();
    for (i = 0; i<5; i++)
    {
      if (a[i] == n)
      {
        flag = 1;
        break;
      }
    }
    if (flag == 1)
    {
      System.out.println("Number found at position:" +(i+1));
    }
    else
    {
      System.out.println("Number not found");
    }
  }
}