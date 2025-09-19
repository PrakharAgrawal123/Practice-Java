import java.util.Scanner;
public class Matrix_Addition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];

        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();   // ✅ fixed
            }
        }

        System.out.println("Enter elements for Matrix 2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                b[i][j] = sc.nextInt();   // ✅ fixed
            }
        }

        System.out.println("Resultant Matrix after Addition:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];  // ✅ addition
                System.out.print(c[i][j] + " "); 
            }
            System.out.println(); // next row
        }
    }
}
