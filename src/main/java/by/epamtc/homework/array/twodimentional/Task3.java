package by.epamtc.homework.array.twodimentional;

public class Task3 {
    public static void main(String[] args) {
        MatrixPrinter.print(matrixFormation(6));

    }

    private static int[][] matrixFormation(int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (size - i > size / 2) {
                    if (j >= size - i || j < i) {
                        continue;
                    }
                    matrix[i][j] = 1;
                } else {
                    if (j < size - i - 1 || j >= i + 1) {
                        continue;
                    }
                    matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }
}
