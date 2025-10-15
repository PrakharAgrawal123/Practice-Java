
import java.util.Scanner;

public class main_diagonal_element {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the matrix (n): ");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][i] + " ");
        }

    }
}
