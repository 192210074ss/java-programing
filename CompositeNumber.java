import java.util.Scanner;

public class CompositeNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of elements: ");
    int n = scanner.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    System.out.println("Composite numbers:");
    for (int i = 0; i < n; i++) {
      if (isComposite(arr[i])) {
        System.out.print(arr[i] + " ");
      }
    }
  }

  public static boolean isComposite(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return true;
      }
    }
    return false;
  }
}

