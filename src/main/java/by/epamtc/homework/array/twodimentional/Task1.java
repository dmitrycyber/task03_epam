package by.epamtc.homework.array.twodimentional;

public class Task1 {
    public static void main(String[] args) {
        MatrixPrinter.print(matrixFormation(6));
    }

    private static int[][] matrixFormation(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            int counter = 1;
            int number = n;
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = counter;
                    counter++;
                }
            }
            if (i % 2 != 0) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = number;
                    number--;
                }
            }
        }
        return matrix;
    }
}
