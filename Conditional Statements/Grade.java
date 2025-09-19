// WAP TO INPUT THE MARKS OF 4 SUBJECTS CALCUALTE AND PRINT THE PERCENTAGE AND ALSO PRINT GRADE ACCORDING TO THE CONDTIONS 
// per>=80 : Grade A  , per>=70 && per<80 : Grade B ,  per>=60 && per<70 : Grade C , per>=50 &&per<60 : Grade D , per<50 : Fail 

import java.util.Scanner;
public class Grade {
  public static void main (String args [])
  {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the first mark");
    double m1 , m2 , m3 , m4;
    m1 = sc.nextDouble();
    System.out.println("enter the second mark");
    m2 = sc.nextDouble();
    System.out.println("enter the third mark");
    m3 = sc.nextDouble();
    System.out.println("enter the fourth mark");
    m4 = sc.nextDouble();
    double sum = (m1+m2+m3+m4);
    double per = sum/4;
    System.out.println("Percentage is " +per);
    if (per>=80)
    {
      System.out.println("Grade A");
    }
    else if (per>=70 && per<80)
    {
      System.out.println("Grade B");
    }
    else if (per>=60 && per<70)
    {
      System.out.println("Grade c");
    }
    else if (per>=50 && per<60)
    {
      System.out.println("Grade D");
    }
    else{
      System.out.println("Fail");
    }
  }
}