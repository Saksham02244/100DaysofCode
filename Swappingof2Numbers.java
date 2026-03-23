import java.util.Scanner;

public class Swappingof2Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Before Swapping:");
        System.out.println("a = " +a+ ", b = " +b);

        int temp = a;
        a = b;
        b = temp;

        System.out.print("After Swapping the values are a = " +a+ " and b = " +b);
        sc.close();
    }
}
