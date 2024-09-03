import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    int factorial = calculateFactorial(num);

    System.out.println("Factorial of " + num + " is " + factorial);
  }

  public static int calculateFactorial(int n) {
    int factorial = 1;
    for (int i = 1; i <= n; i++) {
      factorial *= i;
    }
    return factorial;
  }
}