import java.util.Scanner;
public class Bubble_Sort{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[]={9,6,1,30,8};
    System.out.println("Orignal Array");
    for (int i = 0; i < 5; i++) 
    {
      System.out.println(a[i] +"\t");
    }
    for (int i = 0; i <4; i++)
    {
      for (int j =0; j < 4 -i; j++)
      {
        if (a[j] > a[j+1])
        {
          int temp =a[j];
          a[j] = a[j+1];
          a [j+1] = temp;
        }
      }
    }
    System.out.println("\nSorted Array");
    for (int i = 0; i<5; i++)
    {
      System.out.println(a[i]+"\t");
    }
  }
}