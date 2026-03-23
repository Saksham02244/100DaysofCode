import java.util.Scanner;
public class MaximumElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        //taking array input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //assume first element as maximum
        int max = arr[0];

        //traverse each element to find maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  //max update if current element found as maximum
            }
        }
        System.out.println("Maximum element is :" +max);
    }
}
