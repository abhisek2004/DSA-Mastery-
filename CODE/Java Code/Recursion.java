import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end number: ");
        int end = scanner.nextInt();

        printNumbers(start, end);

        scanner.close();
    }

    public static void printNumbers(int current, int end) {
        if (current > end) {
            return;
        }
        System.out.print(current);
        if (current < end) {
            System.out.print(",");
        }
        printNumbers(current + 1, end);
    }
}