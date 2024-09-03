import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the size of the table
        System.out.print("Enter the size of the multiplication table: ");
        int size = scanner.nextInt();

        // Print the multiplication table
        printMultiplicationTable(size);

        // Close the scanner
        scanner.close();
    }

    public static void printMultiplicationTable(int size) {
        // Print the top header row
        System.out.print("    ");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // Print the separator line
        System.out.print("    ");
        for (int i = 1; i <= size; i++) {
            System.out.print("----");
        }
        System.out.println();

        // Print the multiplication rows
        for (int i = 1; i <= size; i++) {
            // Print the row header
            System.out.printf("%2d |", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
