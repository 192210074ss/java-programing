import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int decimal = scanner.nextInt();
        scanner.close();

        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary equivalent: " + binary);
    }
}
