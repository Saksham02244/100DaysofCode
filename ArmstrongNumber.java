import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();

        int original = n;

        int count = 0;
        int sum = 0;

        int temp = n;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        while(n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, count);
            n = n / 10;
        }

        System.out.println("Original Number is :" +original);
        System.out.println("And the required sum is :" +sum);

        if (sum == original) {
            System.out.println("Therefore, " +original+ " IS AN ARMSTRONG NUMBER.");
        } else {
            System.out.println("Therefore, " +original+ " is NOT an Armstrong Number");
        }

        sc.close();
    }
}
