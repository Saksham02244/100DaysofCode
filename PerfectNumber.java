import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();

        int sum = 0;

        //Loop from 1 to num-1 to find divisors
        for (int i = 1; i < num; i++) {
            //Check if i divides num completely
            if (num % i == 0) {
                System.out.print(i+ " ");
                sum += i;  //add divisor to sum
            }
        }

        System.out.println("\nSum of its divisors excluding itself :" +sum);

        //Check perfect number condition
        if (sum == num) {
            System.out.println("Therefore, " +num+ " IS A PERFECT NUMBER.");
        } else {
            System.out.println("Therefore, " +num+ " IS NOT A PERFECT NUMBER.");
        }
        sc.close();
    }
}
