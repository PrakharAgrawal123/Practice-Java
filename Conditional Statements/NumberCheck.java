//Write a Java program to input a number from the user and print whether it is positive or negative or zero

import java.util.Scanner;

public class NumberCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    if (number > 0) {
      System.out.println("The number is positive.");
    } else if (number < 0) {
      System.out.println("The number is negative.");
    } else if (number == 0) {
      System.out.println("The number is zero");
    } else {
      System.out.println("The number does not exists.");
    }
  }
}