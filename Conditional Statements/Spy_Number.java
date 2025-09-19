
import java.util.Scanner;
public class Spy_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = 0;
        int mul = 1 , a;
        while (n > 0) {
            a = n % 10;
            sum = sum + a;
            mul = mul *a;
            n = n / 10;
        }

        if (sum == mul)
        {
          System.out.println("Number is spy number");
        }
        else
        {
          System.out.println("Number is not a spy number");
        }

    }
}
