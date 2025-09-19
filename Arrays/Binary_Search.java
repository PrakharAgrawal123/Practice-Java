import java.util.Scanner;
public class Binary_Search{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   int[] a = {2, 4, 5, 8, 10};
    int flag = 0;
    int low = 0 , high =a.length-1 , mid =0;
    System.err.println("Number to be searched:");
    int n = sc.nextInt();
    while (low <=high )
    {
      mid = (low + high)/2;
      if (a[mid]>n)
      {
        high = mid -1;
      }
      else if ( a[mid]<n)
      {
        low = mid +1;
      }
      else
      {
        flag = 1;
        break;
      }
    }
    if (flag == 1)
    {
      System.out.println("Number found at position = " + (mid + 1));
    }
    else
    {
      System.out.println("Number not found");
    }
  }
}
