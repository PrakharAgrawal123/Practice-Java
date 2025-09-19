
import java.util.Scanner;

public class Double_Letter_Words {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        s = s.trim().replaceAll("\\s+", " ");
        int len = s.length();
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < len - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
        }
        System.out.println("Number of Double letter Words:" + (count));
    }
}
