import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the character to count: ");
        char target = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("Occurrences of '" + target + "': " + count);
        scanner.close();
    }
}