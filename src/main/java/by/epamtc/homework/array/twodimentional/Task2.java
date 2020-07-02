package by.epamtc.homework.array.twodimentional;

public class Task2 {
    public static void main(String[] args) {
        MatrixPrinter.print(matrixFormation(6));
    }

    private static int[][] matrixFormation(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j){
                    matrix[i][j] = (i+1)*(j+2);
                }
            }
        }
        return matrix;
    }
}
