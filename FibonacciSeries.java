import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms :");
        int n = sc.nextInt();

        //First two numbers of Fibonacci series
        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series : ");

        //Loop to print Fibonacci numbers
        for (int i = 1; i <= n; i++) {
            System.out.print(first+ " ");  //print current number
            int next = first + second;  //calculate next number

            //update values
            first = second;
            second = next;
        }
        sc.close();
    }
}