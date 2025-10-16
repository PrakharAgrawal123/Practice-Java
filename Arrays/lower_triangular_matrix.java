import java.util.Scanner;

public class lower_triangular_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the matrix: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean isLower = true;  // assume it is lower triangular

        // The lower triangular matrix has all the elements above the main diagonal as zero (where i < j)

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j && arr[i][j] != 0) {
                    isLower = false;
                    break;
                }
            }
        }

        if (isLower) {
            System.out.println("The matrix is an lower Triangular Matrix.");
        } else {
            System.out.println("The matrix is NOT an lower Triangular Matrix.");
        }

        sc.close();
    }
}
