import java.util.Scanner;

public class PrintNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        printNumbers(1, n);
        scanner.close();
    }

    public static void printNumbers(int current, int n) {
        if (current > n) {
            return;
        }
        System.out.print(current);
        if (current < n) {
            System.out.print(",");
        }
        printNumbers(current + 1, n);
    }
}
