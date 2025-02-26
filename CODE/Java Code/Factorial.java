import java.util.Scanner;

public class Factorial {

    // Recursive method to find factorial
    public static long factorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();

        // Call the recursive method to compute the factorial
        long result = factorial(num);

        // Print the factorial result
        System.out.println("Factorial of " + num + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}

