import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }

            System.out.println();
        }

        scanner.close();
    }

    public static int pascal(int i, int j) {
        if (j == 0 || j == i) {
            return 1;
        } else {
            return pascal(i - 1, j - 1) + pascal(i - 1, j);
        }
    }
}
