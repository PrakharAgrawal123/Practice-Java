// Write a java program for calculate the roots of a quadratic equation

import java.util.Scanner;

public class Quardatic {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the coefficient of a = ");
    double a = sc.nextDouble();

    System.out.print("Enter the coefficient of b = ");
    double b = sc.nextDouble();

    System.out.print("Enter the coefficient of c = ");
    double c = sc.nextDouble();

    if (a == 0) {
      System.out.println("This is not a quadratic equation because 'a' cannot be zero.");
    } else {
      double D = (b * b) - (4 * a * c);

      if (D > 0) {
        double root1 = (-b + Math.sqrt(D)) / (2 * a);
        double root2 = (-b - Math.sqrt(D)) / (2 * a);
        System.out.println("Roots are real and distinct");
        System.out.println("First root: " + root1);
        System.out.println("Second root: " + root2);
      } else if (D == 0) {
        double root = -b / (2 * a);
        System.out.println("Roots are real and equal: " + root);
      } else {
        double realPart = -b / (2 * a);
        double imagPart = Math.sqrt(-D) / (2 * a);
        System.out.println("Roots are imaginary and complex:");
        System.out.println("Root 1 = " + realPart + " + " + imagPart + "i");
        System.out.println("Root 2 = " + realPart + " - " + imagPart + "i");
      }
    }

    sc.close();
  }
}
