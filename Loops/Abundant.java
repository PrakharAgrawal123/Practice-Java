//Abundant Number is a number where the sum of it's proper divisors (excluding number itself) is greater then the number 

import java.util.Scanner;

public class Abundant {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum > num) {
            System.out.println("Number " + num + " is Abundant Number");
        } else {
            System.out.println("Number " + num + " is not Abundant Number");
        }
    }
}
