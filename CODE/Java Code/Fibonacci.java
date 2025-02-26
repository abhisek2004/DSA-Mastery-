import java.util.Scanner;

public class Fibonacci {

    // Recursive function to find the Fibonacci number at position n
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: Fibonacci(0) = 0, Fibonacci(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of terms
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int terms = scanner.nextInt();

        System.out.print("Fibonacci series: ");

        // Print Fibonacci series up to the 'terms' number
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }
}
