public class HollowTriangle {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = i; j < n; j++)
                System.out.print(" ");

            // print stars and spaces
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}


/*
OUTPUT:

     *
    * *
   *   *
  *     *
 *       *
***********

*/

