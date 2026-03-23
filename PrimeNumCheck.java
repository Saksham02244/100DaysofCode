import java.util.Scanner;

public class PrimeNumCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int count = 0;

        if (n <= 1) {
            System.out.println(n+ " is NOT a prime number.\nEnter number greater than 1.");
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }
        sc.close();
    }
}