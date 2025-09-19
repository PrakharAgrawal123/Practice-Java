
//WAP TO INPUT A ( 3* 3 ) matrix and print it's even numbers 

import java.util.Scanner;

public class Arrayeven {

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

        System.out.println("The full matrix is :");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\n The even numbers in the matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.println(arr[i][j] + " ");
                }
            }
        }

        sc.close();
    }
}
