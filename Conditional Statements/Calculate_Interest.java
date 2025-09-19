//WAP to calculate the simple interest and compound interest using switch case condition and taking user input 

import java.util.Scanner;
public class Calculate_Interest{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("1. Simple Interest");
    System.out.println("2. Compound Interest");
    System.out.println("Enter your choice ");
    int ch = sc.nextInt();
    double P,R,t;
    switch(ch)
    {
      case 1:
        System.out.println("Enter Principle");
        P = sc.nextDouble();
        System.out.println("Enter Rate ");
        R = sc.nextDouble();
        System.out.println("Enter time ");
        t = sc.nextDouble();
        double SI = (P*R*t)/100; //THIS IS FOR SIMPLE INTEREST 
        System.out.println("Simple Interest is "+SI);
        break;
        case 2:
        System.out.println("Enter Principle");
        P = sc.nextDouble();
        System.out.println("Enter Rate ");
        R = sc.nextDouble();
        System.out.println("Enter time ");
        t = sc.nextDouble();
        double CI = (P*(Math.pow(1+R/100 , t ) - 1));  // THIS IS FOR COMPOUND INTEREST 
        System.out.println("Compound Interest is " + CI);
        break;
        default:
          System.out.println("Wrong choice");
    }
  }

}