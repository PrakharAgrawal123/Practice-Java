
import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int gcd = a, temp = b;
        while (temp != 0) {
            int t = temp;
            temp = gcd % temp;
            gcd = t;
        }
        int lcm = (a * b) / gcd;
        System.out.println("LCM is: " + lcm);
    }
}
