import java.util.Scanner;

public class SwappingWithoutTemp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Before Swapping:");
        System.out.println("a = " +a+ ", b = " +b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.print("After Swapping the values are a = " +a+ " and b = " +b);
        sc.close();
    }
}
