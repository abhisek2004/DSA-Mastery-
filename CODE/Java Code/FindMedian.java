import java.util.Arrays;
import java.util.Scanner;

public class FindMedian {

    public static int findMedian(int[] arr) {
        Arrays.sort(arr);
        int middleIndex = arr.length / 2;
        return arr[middleIndex];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int median = findMedian(arr);
        System.out.println(median);
    }
}