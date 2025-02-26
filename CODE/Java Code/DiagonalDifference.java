import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int leftDiagonal = 0, rightDiagonal = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
                if (i == j)
                    leftDiagonal += matrix[i][j];
                if (i + j == n - 1)
                    rightDiagonal += matrix[i][j];
            }
        }

        System.out.println(Math.abs(leftDiagonal - rightDiagonal));
        sc.close();
    }
}