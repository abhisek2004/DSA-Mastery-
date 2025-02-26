import java.util.Scanner;

public class ReverseNumber2 {
    public static void reverseNumber(int n) {
        if (n == 0)
            return;
        System.out.print(n % 10);
        reverseNumber(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        reverseNumber(Math.abs(n)); // Reverse and print number
        System.out.println("\nNumber of digits: " + String.valueOf(Math.abs(n)).length());
        scanner.close();
    }
}