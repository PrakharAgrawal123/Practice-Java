//WAP TO PRINT THE CORNER ELEMENTS OF THE MATRIX 3*3

import java.util.Scanner;
public class Array_Corner_Elements {

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

        System.out.println("The matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The corner elements are:");
        System.out.println("Element at arr[0][0]: " + arr[0][0]);
        System.out.println("Element at arr[0][n-1]: " + arr[0][n - 1]);
        System.out.println("Element at arr[n-1][0]: " + arr[n - 1][0]);
        System.out.println("Element at arr[n-1][n-1]: " + arr[n - 1][n - 1]);

        sc.close();
    }
}
