import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int original = n;
        int count = 0;

        if (n == 0) {
            count = 1;
        } else {
            while (n != 0) {
                n = n / 10;
                count++;
            }
        }
        System.out.println(original+ " has " +count+ " digits in count.");
        sc.close();
    }
}
