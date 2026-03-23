import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println("THe sum of the given number is: " +sum);
        sc.close();
    }
}
