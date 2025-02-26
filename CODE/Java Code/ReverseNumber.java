import java.util.Scanner;

public class ReverseNumber {

    // Recursive method to reverse and print the number
    public static void reverseNumber(int n) {
        // Base case: if the number is 0, stop the recursion
        if (n == 0) {
            return;
        }

        // Print the last digit
        System.out.print(n % 10);

        // Recursive call with the remaining number (excluding the last digit)
        reverseNumber(n / 10);
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // If the number is negative, make it positive
        if (n < 0) {
            n = -n; // Convert negative to positive
        }

        // Call the recursive method to reverse and print the number
        reverseNumber(n);

        // Close the scanner
        scanner.close();
    }
}
