import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {

        // take number of rows from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(); // next line
        }
        sc.close(); // good practice
    }
}
