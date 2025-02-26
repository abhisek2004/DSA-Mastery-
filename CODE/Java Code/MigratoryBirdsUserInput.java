import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MigratoryBirdsUserInput {

    public static int migratoryBirds(int[] arr) {
        Map<Integer, Integer> birdCounts = new HashMap<>();

        for (int birdType : arr) {
            birdCounts.put(birdType, birdCounts.getOrDefault(birdType, 0) + 1);
        }

        int maxCount = 0;
        int mostFrequentBird = -1;

        for (Map.Entry<Integer, Integer> entry : birdCounts.entrySet()) {
            int birdType = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                mostFrequentBird = birdType;
            } else if (count == maxCount && birdType < mostFrequentBird) {
                mostFrequentBird = birdType;
            }
        }

        return mostFrequentBird;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of bird sightings: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the bird types (space-separated): ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = migratoryBirds(arr);
        System.out.println("The most frequently sighted bird type is: " + result);

        scanner.close();
    }
}