import java.util.Scanner;

public class identity_matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the matrix (n): ");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean isIdentity = true;

        // Check identity matrix condition
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && arr[i][j] != 1) {
                    isIdentity = false;
                    break;
                } else if (i != j && arr[i][j] != 0) {
                    isIdentity = false;
                    break;
                }
            }
        }

        if (isIdentity) {
            System.out.println("The matrix is an Identity Matrix.");
        } else {
            System.out.println("The matrix is not an Identity Matrix.");
        }

        sc.close();
    }
}
