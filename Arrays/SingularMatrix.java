//WAP to check whether a given matrix is a Singular Matrix or not 

import java.util.Scanner;

public class SingularMatrix {

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

        int a = arr[0][0];
        int b = arr[0][1];
        int c = arr[0][2];
        int d = arr[1][0];
        int e = arr[1][1];
        int f = arr[1][2];
        int g = arr[2][0];
        int h = arr[2][1];
        int i = arr[2][2];

        int determinant = a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);

        if (determinant == 0) {
            System.out.println("Matrix is singular");
        } else {
            System.out.println("Matrix is not singular");
        }
        sc.close();
    }
}
