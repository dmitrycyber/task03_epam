package by.epamtc.homework.array.twodimentional;

public class Task2 {
    public static void main(String[] args) {
        MatrixPrinter.print(matrixFormation(6));
    }

    private static int[][] matrixFormation(int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    matrix[i][j] = (i + 1) * (j + 2);
                }
            }
        }
        return matrix;
    }
}
