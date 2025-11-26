
import java.util.Scanner;

public class Even_Odd_Count_Array {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the matrix (n): ");
    int n = sc.nextInt();
    int count_even = 0;
    int count_odd = 0;
    int arr[][] = new int[n][n];

    System.out.println("Enter the elements of the matrix:");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (arr[i][j] % 2 == 0) {
          count_even++;
        } else {
          count_odd++;
        }
      }
    }
    System.out.println("The even elements are: " + count_even);
    System.out.println("The Odd elements are: " + count_odd);
  }
}
