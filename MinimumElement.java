import java.util.Scanner;
public class MinimumElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        //array elements as input from the user
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //assume the first element is the smallest
        int min = arr[0];

        //Traverse each element of array starting from index 1
        for (int i = 1; i < arr.length; i++) {
            //Compare current element with min
            if (arr[i] < min) {
                //Update min if current element is smaller than the min
                min = arr[i];
            }
        }
        System.out.println("Smallest element in an array is :" +min);
        sc.close();
    }
}
