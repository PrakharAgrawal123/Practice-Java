import java.util.Scanner;

public class Reverse {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int rev = 0;
        while (n > 0)
        {
          int a  = n % 10;
          rev = rev*10 + a;
          n = n /10;
        }
        System.out.println("Reverse Number = " +rev);
    }
}