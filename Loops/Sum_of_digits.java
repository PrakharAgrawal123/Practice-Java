import java.util.Scanner;
public class Sum_of_digits{
  public static void main(String args[])
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a number ");
    int n = sc.nextInt();
    int sum = 0;
    while (n > 0)
    {
      int a = n & 10;
      sum = sum + a;
      n = n / 10;
    }
    System.out.println(sum);
  }
}