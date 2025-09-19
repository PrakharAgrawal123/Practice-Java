//A Buzz number in Java is defined as a number that either ends with the digit 7 or is divisible by 7.

import java.util.Scanner;

public class BuzzNumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number here ");
        int num = sc.nextInt();
        if (num % 7 == 0 || num % 10 == 7) {
            System.out.println("Number " + num + " is a Buzz Number");
        } else {
            System.out.println("Number " + num + " is not  a Buzz Number");
        }
    }
}
