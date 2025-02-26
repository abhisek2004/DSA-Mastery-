import java.util.Scanner;

public class PatternPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for the number of lines (rows)
        System.out.print("Enter the number of lines: ");
        int lines = scanner.nextInt();

        // Loop for printing the pattern
        for (int i = 0; i < lines; i++) {
            // Loop to print stars on each line
            for (int j = 0; j < lines; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing stars
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
