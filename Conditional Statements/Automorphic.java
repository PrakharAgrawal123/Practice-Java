//Automorphic number is a number whose square ends with the same number itself

import java.util.Scanner;

public class Automorphic {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int square = n * n;
        int d = String.valueOf(n).length();
        int lastDigits = square % (int) Math.pow(10, d);

        if (lastDigits == n) {
            System.out.println(n + " is an automorphic number.");
        } else {
            System.out.println(n + " is not an automorphic number.");
        }

    }
}
