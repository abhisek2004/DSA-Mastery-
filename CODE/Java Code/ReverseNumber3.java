import java.util.Scanner;

public class ReverseNumber3 {

    // Method to reverse the number
    public static int reverseNumber(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + reverseNumber(n / 10) * 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Reverse the number
        int reversed = reverseNumber(Math.abs(n));

        // Check if the number is a palindrome by comparing it to the original number
        // We need to compare the original number with the reversed one
        if (Math.abs(n) == reversed) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

        // Print the reversed number
        System.out.println("Reversed Number: " + reversed);

        scanner.close();
    }
}
