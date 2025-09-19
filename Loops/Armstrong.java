
import java.util.Scanner;

public class Armstrong {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int original = a;
        int sum = 0;

        while (a > 0) {
            int r = a % 10;
            sum += Math.pow(r, 3);  // returns double, will cast below
            a = a / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
