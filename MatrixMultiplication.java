public class MatrixMultiplication {
  public static void main(String[] args) {
    int rows1 = 2;
    int cols1 = 3;
    int rows2 = 3;
    int cols2 = 2;

    int[][] matrix1 = {
      {1, 2, 3},
      {4, 5, 6}
    };

    int[][] matrix2 = {
      {7, 8},
      {9, 10},
      {11, 12}
    };

    int[][] result = new int[rows1][cols2];

    for (int i = 0; i < rows1; i++) {
      for (int j = 0; j < cols2; j++) {
        for (int k = 0; k < cols1; k++) {
          result[i][j] += matrix1[i][k] * matrix2[k][j];
        }
      }
    }

    System.out.println("Resultant Matrix:");
    for (int i = 0; i < rows1; i++) {
      for (int j = 0; j < cols2; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }
  }
}