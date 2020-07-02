package by.epamtc.homework.array.twodimentional;

public class Task4 {
    public static void main(String[] args) {
        MatrixPrinter.print(matrixFormation(new int[]{1, 2, 3, 4}));

    }

    private static int[][] matrixFormation(int[] array) {
        int[][] matrix = new int[array.length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                matrix[i][j] = (int) Math.pow(array[j], i+1);
            }
        }
        return matrix;
    }
}
