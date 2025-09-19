
import java.util.Scanner;

public class Neon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int square = n * n;
        int sum = 0;
        int temp = square;
        while (temp > 0) {
            int d = temp % 10;
            sum += d;
            temp = temp / 10;
        }
        if (sum == n) {
            System.out.println("Number " + n + " is Neon number");
        } else {
            System.out.println("Number " + n + " is not  Neon number");

        }
    }
}
