
import java.util.Scanner;

public class Matrix_Transpose {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr1[][] = new int[rows][cols];
        int arr2[][] = new int[cols][rows];

        System.out.println("Enter the elements of first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2[i][j] = arr1[j][i];
            }
        }

        System.out.print("The transpose of the matrix is:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(arr2[j][i] + " ");
            }
            System.out.println();
        }
    }
}
