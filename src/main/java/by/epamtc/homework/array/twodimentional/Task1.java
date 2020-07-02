package by.epamtc.homework.array.twodimentional;

public class Task1 {
    public static void main(String[] args) {
        MatrixPrinter.print(matrixFormation(6));
    }

    private static int[][] matrixFormation(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            int num = 1;
            int num2 = n;
            if (i % 2 == 0){
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = num;
                    num ++;
                }
            }
            if (i % 2 != 0){
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = num2;
                    num2 --;
                }
            }
        }
        return matrix;
    }
}
