package by.epamtc.homework.array.twodimentional;

public class Task3 {
    public static void main(String[] args) {
        MatrixPrinter.print(matrixFormation(6));

    }

    private static int[][] matrixFormation(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n - i > n / 2) {
                    if (j >= n - i || j < i) {
                        continue;
                    }
                    matrix[i][j] = 1;
                }
                else {
                    if (j < n - i - 1 || j >= i + 1) {
                        continue;
                    }
                    matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }
}
