public class ArmstrongCheck {
    public static void main(String[] args) {

        // Loop through numbers from 1 to 1000
        for (int num = 1; num <= 10000; num++) {

            int original = num;
            int sum = 0;

            // Process each digit
            while (num != 0) {

                int digit = num % 10;          // Extract last digit
                sum += digit * digit * digit * digit;  // Cube of digit
                num = num / 10;                // Remove last digit
            }

            // Check Armstrong condition
            if (sum == original) {
                System.out.println(original);
            }

            // Reset num for next iteration
            num = original;
        }
    }
}
