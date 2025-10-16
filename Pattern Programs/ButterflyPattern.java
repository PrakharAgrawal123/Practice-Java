public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 6;  // size of the butterfly

        // Upper part
        for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            // Middle spaces
            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");

            // Right stars
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }

        // Lower part (reverse of upper)
        for (int i = n; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            // Middle spaces
            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");

            // Right stars
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
