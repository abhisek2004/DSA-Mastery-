import java.util.Scanner;

public class Professor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            // System.out.println("enter the arrival time for the students");
            int arrivalTime = sc.nextInt();
            if (arrivalTime <= 0) {
                count++;
            }
        }

        System.out.println(count >= k ? "NO" : "YES");
        sc.close();

    }
}